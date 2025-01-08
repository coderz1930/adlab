import React, { useState } from 'react';
import { View, TextInput, Button, Text } from 'react-native';

export default function App() {
    const [city, setCity] = useState('');
    const [weather, setWeather] = useState('');
    
    const fetchWeather = () => {
        // This is a simplified version. In a real app, you'd use an API like OpenWeatherMap.
        // For this example, we are hardcoding a mock response.
        if (city.toLowerCase() === 'london') {
            setWeather('Weather in London: 15°C, Clear');
        } else if (city.toLowerCase() === 'new york') {
            setWeather('Weather in New York: 10°C, Cloudy');
        } else {
            setWeather('Weather information not available for this city.');
        }
    };

    return (
        <View style={{ padding: 20 }}>
            <TextInput
                value={city}
                onChangeText={setCity}
                placeholder="Enter city name"
                style={{ borderWidth: 1, marginBottom: 10, padding: 10 }}
            />
            <Button title="Get Weather" onPress={fetchWeather} />
            <Text>{weather}</Text>
        </View>
    );
}
