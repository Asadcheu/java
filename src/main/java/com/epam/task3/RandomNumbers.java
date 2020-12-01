package com.epam.task3;

class RandomNumbers {

    private int amountOfNumbers;
    private Double [] arrayOfRandomNumbers;

    Double[] getArrayOfRandomNumbers() { return arrayOfRandomNumbers; }

    void setAmountOfNumbers(int amountOfNumbers) {
        this.amountOfNumbers = amountOfNumbers;
    }

    double getRandomNumbers () {
        return (Math.random());
    }

    void createTheArrayOfRandomNumbers() {
        arrayOfRandomNumbers = new Double[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            arrayOfRandomNumbers[i] = getRandomNumbers();
        }
    }

    void displayOnTheScreen (String someDescription) {
        System.out.print(someDescription);
    }
}
