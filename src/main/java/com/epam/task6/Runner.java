package com.epam.task6;

import java.util.Scanner;

class Runner {

    public static void main(String[] args) {
        CompatorOfLengthsOfNumbers compatorOfLengthsOfNumbers = new CompatorOfLengthsOfNumbers();
        compatorOfLengthsOfNumbers.displayOnTheScreen("How many numbers' lengths would you like to compare? "  );
        compatorOfLengthsOfNumbers.setLengthOfArrayOfNumbers(new Scanner(System.in).nextInt());
        compatorOfLengthsOfNumbers.displayOnTheScreen("Enter the numbers: "  );
        compatorOfLengthsOfNumbers.createArrayOfNumbers();
        compatorOfLengthsOfNumbers.findANumberWithAShorterLength();
        compatorOfLengthsOfNumbers.displayOnTheScreen("The shortest number "
                + compatorOfLengthsOfNumbers.getShortestLengthOfNumber()
                + " has a length = " + compatorOfLengthsOfNumbers.getMinLengthOfANumber());
        compatorOfLengthsOfNumbers.findANumberWithALargestLength();
        compatorOfLengthsOfNumbers.displayOnTheScreen("The largest number "
                + compatorOfLengthsOfNumbers.getLargestLengthOfNumber()
                + " has a length = " + compatorOfLengthsOfNumbers.getMaxLengthOfANumber());
    }
}


