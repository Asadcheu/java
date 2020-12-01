package com.epam.task8;

import java.util.Scanner;

class Runner {

    public static void main(String[] args) {

        Student[] students = new Student[] {
            new Student("235", "Гришин", "Антон", "Павлович", 16, 8, 1994, "Krasin str. 41", "5100111", "GEO", 1, 1),
            new Student("316", "Иванов", "Егор", "Антонович", 12, 1, 1996, "Krasin str. 47", "5496361", "GEO", 2, 2),
            new Student("119", "Петров", "Кирилл", "Иванович", 14, 2, 1998, "Krasin str. 46", "1296661", "GEO", 2, 3),
            new Student("415", "Васильев", "Казимир", "Петрович", 8, 3, 1990, "Krasin str. 34", "7896561", "MMF", 3, 2),
            new Student("226", "Кручко", "Евгений", "Артёмович", 9, 4, 1991, "Krasin str. 18", "5002261", "MMF", 1, 3),
            new Student("301", "Соловьёв", "Анатолий", "Петрович", 12, 4, 1992, "Krasin str. 16", "8796861", "MMF", 2, 3),
            new Student("174", "Борзыхин", "Дмитрий", "Максимович", 18, 5, 1994, "Krasin str. 25", "8364661", "GEO", 1, 1),
            new Student("341", "Радкевич", "Максим", "Витальевич", 21, 8, 1994, "Krasin str. 14", "4128661", "GEO", 3, 2),
            new Student("403", "Ковальков", "Алексей", "Олегович", 26, 11, 1999, "Krasin str. 11", "9567301", "MMF", 1, 1),
            new Student("123", "Демчук", "Руслан", "Егорович", 24, 2, 2000, "Krasin str. 37", "7986431", "MMF", 3, 2)
        };

        StudentsSorter studentsSorter = new StudentsSorter();
        studentsSorter.displayOnTheScreen("Enter the faculty (GEO or MMF): ");
        studentsSorter.setSelectedFaculty(new Scanner(System.in).next().toUpperCase());
        studentsSorter.displaySelectedFaculty(students);

        studentsSorter.displayOnTheScreen("Enter the faculty (GEO or MMF): ");
        studentsSorter.setSelectedFaculty(new Scanner(System.in).next().toUpperCase());
        studentsSorter.displayOnTheScreen("Choose the course (1 - 3): ");
        studentsSorter.setSelectedCourse(new Scanner(System.in).nextInt());
        studentsSorter.displayTheListOfStudentsOfTheChosenFacultyAndCourse(students);

        studentsSorter.displayOnTheScreen("Student was born after ... year: ");
        studentsSorter.setSelectedYearOfBirth(new Scanner(System.in).nextInt());
        studentsSorter.displayTheListOfStudentsWichWereBornAfterChosenYear(students);

        studentsSorter.displayOnTheScreen("Enter the number of the group (1 - 3): ");
        studentsSorter.setSelectedGroupNumber(new Scanner(System.in).nextInt());
        studentsSorter.displayTheListOfStudentsOfTheChosenGroup(students);
    }
}

