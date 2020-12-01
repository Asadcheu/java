package com.epam.task9;

import java.util.*;

class AppliancesSorter {

    void displayAppliancesType (ArrayList<HomeAppliances> homeAppliancesList) {
        Set<String> set = new TreeSet<>();
        for (HomeAppliances homeAppliance : homeAppliancesList) {
            set.add(homeAppliance.getTypeOfAnAppliance());
        }
        int j = 1;
        for (String elem : set) {
            System.out.println(j++ + ") " + elem);
        }
    }


    void sumPowersTurnedOnAppliances(ArrayList<HomeAppliances> homeAppliancesList) {
        int powersSum = 0;
        while (true) {
            System.out.println();
            System.out.print("Choose the category (1 - 6) or '0' to exit: ");
            int categoryNumber = new Scanner(System.in).nextInt();
            for (HomeAppliances homeApplience: homeAppliancesList) {
                if (homeApplience.getCategory() == categoryNumber) {
                    System.out.println(homeApplience);
                }
            }
            if (categoryNumber == 0) { break;}
            System.out.println();
            System.out.println("Choose appliances which would you like to turn on (enter indexNumbers for appliances) " +
                    "or enter '0' to leave this category: ");
            int indexNumber = 100;
            while (indexNumber != 0) {
                indexNumber = new Scanner(System.in).nextInt();
                for (HomeAppliances homeApplience: homeAppliancesList) {
                    if (homeApplience.getIndexNumber() == indexNumber) {
                        powersSum += homeApplience.getPowerOfAnAppliance();
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Sum of powers of turned on appliances = " + powersSum + "W");
    }


    void sortAppliancesByPower(ArrayList<HomeAppliances> homeAppliancesList) {
        System.out.println();
        System.out.println("Home appliances sorted by power:");
        homeAppliancesList.sort(Comparator.comparing(homeAppliance -> homeAppliance.getPowerOfAnAppliance()));
        homeAppliancesList.forEach(System.out::println);
    }


    void findNecessaryAppliance(ArrayList<HomeAppliances> homeAppliancesList) {
        System.out.println();
        displayAppliancesType(homeAppliancesList);
        System.out.println();
        System.out.print("Enter the appliance category (1 - 6): ");
        int applianceCategory = new Scanner(System.in).nextInt();
        System.out.print("Enter appliance power (5 - 3000): ");
        int appliancePower = new Scanner(System.in).nextInt();
        System.out.println("Home appliances of " + applianceCategory + " category have power more than " + appliancePower + "W:");
        homeAppliancesList.stream().filter(homeAppliance ->
                homeAppliance.getCategory() == applianceCategory &&
                        homeAppliance.getPowerOfAnAppliance() > appliancePower)
                .forEach(System.out::println);
    }
}
