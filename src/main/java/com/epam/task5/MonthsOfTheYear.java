package com.epam.task5;

import java.util.HashMap;

class MonthsOfTheYear {

    private int numberOfMonth;
    private String monthOfYear;

    int getNumberOfMonth() {
        return numberOfMonth;
    }

    void setNumberOfMonth(int numberOfMonth) {
        if (numberOfMonth <= 12 && numberOfMonth >= 1) {
            this.numberOfMonth = numberOfMonth;
        } else throw new IllegalArgumentException("Entered incorrect data!");

    }

    String getMonthOfYear(HashMap<Integer, String> monthsOfTheYear, int numberOfMonth) {
        monthOfYear = monthsOfTheYear.get(numberOfMonth);
        return monthOfYear;
    }

    void displayOnTheScreen (String someDescription) {
        System.out.print(someDescription);
    }
}
