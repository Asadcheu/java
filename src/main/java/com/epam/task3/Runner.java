package com.epam.task3;

import java.util.Arrays;
import java.util.Scanner;

class Runner {

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.displayOnTheScreen("Enter an amount of random numbers: ");
        randomNumbers.setAmountOfNumbers(new Scanner(System.in).nextInt());
        randomNumbers.createTheArrayOfRandomNumbers();
        randomNumbers.displayOnTheScreen(Arrays.toString(randomNumbers.getArrayOfRandomNumbers()));
    }
}
