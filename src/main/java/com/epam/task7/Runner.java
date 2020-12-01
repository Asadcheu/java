package com.epam.task7;

import java.util.Arrays;
import java.util.Scanner;

class Runner {

    public static void main(String[] args) {
        SorterLengthsOfNumbers sorterLengthsOfNumbers = new SorterLengthsOfNumbers();
        sorterLengthsOfNumbers.displayOnTheScreen("How many numbers' lengths would you like to compare? ");
        sorterLengthsOfNumbers.setLengthOfArray(new Scanner(System.in).nextInt());
        sorterLengthsOfNumbers.displayOnTheScreen("Enter the numbers: ");
        sorterLengthsOfNumbers.createArrayOfNumbers();
        sorterLengthsOfNumbers.sortingFromTheShorterToLongerLengthsOfNumbers();
        sorterLengthsOfNumbers.displayOnTheScreen("From short numbers' lengths to long " +
                Arrays.toString(sorterLengthsOfNumbers.getArrayOfNumbers()));
        sorterLengthsOfNumbers.sortingFromTheLongerToShorterLengthsOfNumbers();
        sorterLengthsOfNumbers.displayOnTheScreen("From long numbers' lengths to short " +
                Arrays.toString(sorterLengthsOfNumbers.getArrayOfNumbers()));
        }
}
