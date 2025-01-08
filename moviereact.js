import React, { useState } from 'react';
import { View, Text, Button } from 'react-native';

export default function App() {
    const [selectedSeats, setSelectedSeats] = useState(0);

    const bookSeats = () => setSelectedSeats(selectedSeats + 1);

    return (
        <View style={{ padding: 20 }}>
            <Text>Seats Booked: {selectedSeats}</Text>
            <Button title="Book Seat" onPress={bookSeats} />
        </View>
    );
}
