package com.epam.task4;

class Calculator {

    private int sumOfNumbers = 0;
    private int multiplicationOfNumbers = 1;

    int getSumOfNumbers() {
        return sumOfNumbers;
    }

    int getMultiplicationOfNumbers() {
        return multiplicationOfNumbers;
    }

    void calculateSumOfNumbers(String[] args) {
        for (String arg : args) {
            sumOfNumbers += Integer.parseInt(arg);
        }
    }

    void calculateMultiplicationOfNumbers(String[] args) {
        for (String arg : args) {
            multiplicationOfNumbers *= Integer.parseInt(arg);
        }
    }

    void displayOnTheScreen (String someDescription, int someNumber) {
        System.out.println(someDescription + someNumber);
    }
}
