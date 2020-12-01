package com.epam.task7;

import java.util.Scanner;

class SorterLengthsOfNumbers {

    private int lengthOfArray;
    private String[] arrayOfNumbers;
    private Scanner console = new Scanner(System.in);

    public String[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }

    void setLengthOfArray(int lengthOfArray) { this.lengthOfArray = lengthOfArray; }

    void createArrayOfNumbers() {
        arrayOfNumbers = new String[lengthOfArray];
        int i = 0;
        while (i < lengthOfArray) {
            if (!console.hasNextInt()) {
                throw new IllegalArgumentException("Entered incorrect data!");
            }
            arrayOfNumbers[i] = console.next();
            i++;
        }
    }

    void sortingFromTheShorterToLongerLengthsOfNumbers() {
        boolean sortSwitch = false;
        String additionalVariable;
        while (!sortSwitch) {
            sortSwitch = true;
            for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
                if (arrayOfNumbers[i].length() > arrayOfNumbers[i + 1].length()) {
                    additionalVariable = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[i + 1];
                    arrayOfNumbers[i + 1] = additionalVariable;
                    sortSwitch = false;
                }
            }
        }
    }

    void sortingFromTheLongerToShorterLengthsOfNumbers() {
        boolean sortSwitch = false;
        String additionalVariable;
        while (!sortSwitch) {
            sortSwitch = true;
            for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
                if (arrayOfNumbers[i].length() < arrayOfNumbers[i + 1].length()) {
                    additionalVariable = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[i + 1];
                    arrayOfNumbers[i + 1] = additionalVariable;
                    sortSwitch = false;
                }
            }
        }
    }

    void displayOnTheScreen (String someDescription) {
        System.out.println(someDescription);
    }
}
