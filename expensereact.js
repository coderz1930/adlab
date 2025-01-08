import React, { useState } from 'react';
import { View, TextInput, Button, Text } from 'react-native';

export default function App() {
    const [amount, setAmount] = useState('');
    const [income, setIncome] = useState(0);
    const [expense, setExpense] = useState(0);

    const handleIncome = () => setIncome(income + parseFloat(amount));
    const handleExpense = () => setExpense(expense + parseFloat(amount));

    return (
        <View style={{ padding: 20 }}>
            <TextInput
                value={amount}
                onChangeText={setAmount}
                placeholder="Enter amount"
                style={{ borderWidth: 1, marginBottom: 10, padding: 10 }}
            />
            <Button title="Add Income" onPress={handleIncome} />
            <Button title="Add Expense" onPress={handleExpense} />
            <Text>Income: {income}</Text>
            <Text>Expense: {expense}</Text>
        </View>
    );
}
