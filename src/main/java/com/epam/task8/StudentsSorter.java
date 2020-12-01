package com.epam.task8;

import java.util.Arrays;

class StudentsSorter {

    private String selectedFaculty;
    private int selectedCourse;
    private int selectedYearOfBirth;
    private int selectedGroupNumber;

    void setSelectedFaculty(String selectedFaculty) { this.selectedFaculty = selectedFaculty; }

    void setSelectedCourse(int selectedCourse) { this.selectedCourse = selectedCourse; }

    void setSelectedYearOfBirth(int selectedYearOfBirth) { this.selectedYearOfBirth = selectedYearOfBirth; }

    void setSelectedGroupNumber(int selectedGroupNumber) { this.selectedGroupNumber = selectedGroupNumber; }


    void displaySelectedFaculty(Student[] students) {
        Arrays.stream(students).filter(student -> student.getFaculty().equals(selectedFaculty)).forEach(System.out::println);
    }

    void displayTheListOfStudentsOfTheChosenFacultyAndCourse(Student[] students) {
        Arrays.stream(students).filter(student -> student.getFaculty()
                .equals(selectedFaculty) && student.getCourse() == selectedCourse).forEach(System.out::println);
    }

    void displayTheListOfStudentsWichWereBornAfterChosenYear(Student[] students) {
        Arrays.stream(students).filter(student -> (student.getYearOfBirth() > selectedYearOfBirth)).forEach(System.out::println);
    }

    void displayTheListOfStudentsOfTheChosenGroup(Student[] students) {
        Arrays.stream(students).filter(student -> (student.getGroup() == selectedGroupNumber)).forEach(System.out::println);
    }

    void displayOnTheScreen (String someDescription) {
        System.out.print(someDescription);
    }
}
