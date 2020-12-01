package com.epam.task4;

class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculateSumOfNumbers(args);
        calculator.displayOnTheScreen("Sum of numbers = ", calculator.getSumOfNumbers());
        calculator.calculateMultiplicationOfNumbers(args);
        calculator.displayOnTheScreen("Multiplication of numbers = ", calculator.getMultiplicationOfNumbers());
    }
}
