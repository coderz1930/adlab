import React, { useState } from 'react';
import { View, TextInput, Button, Text } from 'react-native';

export default function App() {
    const [value, setValue] = useState('');
    const [convertedValue, setConvertedValue] = useState('');

    const convertToMiles = () => setConvertedValue(parseFloat(value) * 0.621371);

    return (
        <View style={{ padding: 20 }}>
            <TextInput
                value={value}
                onChangeText={setValue}
                placeholder="Enter km"
                keyboardType="numeric"
                style={{ borderWidth: 1, marginBottom: 10, padding: 10 }}
            />
            <Button title="Convert to Miles" onPress={convertToMiles} />
            <Text>{convertedValue} Miles</Text>
        </View>
    );
}
