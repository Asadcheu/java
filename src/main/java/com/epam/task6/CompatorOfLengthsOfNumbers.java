package com.epam.task6;

import java.util.Scanner;

class CompatorOfLengthsOfNumbers {

    private int lengthOfArray;
    private String[] arrayOfNumbers;
    private int minLengthOfANumber;
    private  String shortestLengthOfNumber;
    private int maxLengthOfANumber;
    private String largestLengthOfNumber;

    public int getMinLengthOfANumber() {
        return minLengthOfANumber;
    }

    public String getShortestLengthOfNumber() {
        return shortestLengthOfNumber;
    }

    public int getMaxLengthOfANumber() {
        return maxLengthOfANumber;
    }

    public String getLargestLengthOfNumber() {
        return largestLengthOfNumber;
    }

    void createArrayOfNumbers() {
        arrayOfNumbers = new String[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            arrayOfNumbers[i] = new Scanner(System.in).next();
        }
    }

    public void setLengthOfArrayOfNumbers(int lengthOfArray) {
        this.lengthOfArray = lengthOfArray;
    }

    void findANumberWithAShorterLength() {
        minLengthOfANumber = arrayOfNumbers[0].length();
        shortestLengthOfNumber = "" + arrayOfNumbers[0];
        for (String arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber.length() < minLengthOfANumber) {
                minLengthOfANumber = arrayOfNumber.length();
                shortestLengthOfNumber = arrayOfNumber;
            }
        }
    }

    void findANumberWithALargestLength() {
        maxLengthOfANumber = arrayOfNumbers[0].length();
        largestLengthOfNumber = "" + arrayOfNumbers[0];
        for (String arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber.length() > maxLengthOfANumber) {
                maxLengthOfANumber = arrayOfNumber.length();
                largestLengthOfNumber = arrayOfNumber;
            }
        }
    }

    void displayOnTheScreen (String someDescription) {
        System.out.println(someDescription);
    }
}
