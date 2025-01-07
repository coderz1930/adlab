import React, { useState } from 'react';
import { View, TextInput, Button, Text } from 'react-native';

export default function App() {
    const [task, setTask] = useState('');
    const [tasks, setTasks] = useState([]);

    const addTask = () => {
        if (task.trim()) {
            setTasks([...tasks, task]);
            setTask('');
        }
    };

    return (
        <View style={{ padding: 20 }}>
            <TextInput 
                value={task}
                onChangeText={setTask} 
                placeholder="Enter task" 
                style={{ borderWidth: 1, marginBottom: 10, padding: 10 }} 
            />
            <Button title="Add Task" onPress={addTask} />
            {tasks.map((item, index) => <Text key={index}>{item}</Text>)}
        </View>
    );
}
