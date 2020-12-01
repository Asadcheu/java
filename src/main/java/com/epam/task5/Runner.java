package com.epam.task5;

import java.util.HashMap;
import java.util.Scanner;

class Runner {

    public static void main(String[] args) {
        HashMap<Integer, String> monthsOfTheYear = new HashMap<Integer, String>() {
            {
                put(1, "January");
                put(2, "February");
                put(3, "March");
                put(4, "April");
                put(5, "May");
                put(6, "June");
                put(7, "July");
                put(8, "August");
                put(9, "September");
                put(10, "October");
                put(11, "November");
                put(12, "December");
            }
        };

        MonthsOfTheYear calendar = new MonthsOfTheYear();
        calendar.displayOnTheScreen("Enter a number of a month: ");
        calendar.setNumberOfMonth(new Scanner(System.in).nextInt());
        calendar.displayOnTheScreen("It's " + calendar.getMonthOfYear(monthsOfTheYear, calendar.getNumberOfMonth()));
    }
}