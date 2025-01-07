import React, { useState } from 'react';
import { View, Text, Button } from 'react-native';

export default function App() {
    const questions = [
        { question: "What is 2 + 2?", options: ["3", "4", "5"], answer: "4" },
        { question: "What is 3 + 5?", options: ["6", "7", "8"], answer: "8" },
    ];

    const [currentQuestion, setCurrentQuestion] = useState(0);
    const [score, setScore] = useState(0);

    const handleAnswer = (selectedOption) => {
        if (selectedOption === questions[currentQuestion].answer) {
            setScore(score + 1);
        }

        const nextQuestion = currentQuestion + 1;
        if (nextQuestion < questions.length) {
            setCurrentQuestion(nextQuestion);
        } else {
            alert(`Your score is ${score}`);
        }
    };

    return (
        <View style={{ padding: 20 }}>
            <Text>{questions[currentQuestion].question}</Text>
            {questions[currentQuestion].options.map((option, index) => (
                <Button key={index} title={option} onPress={() => handleAnswer(option)} />
            ))}
        </View>
    );
}
