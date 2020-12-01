package com.epam.task8;

class Student {

    private String id;
    private String surname;
    private String name;
    private String middleName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private int group;

    Student(String id, String lastName, String name, String middleName, int dayOfBirth, int monthOfBirth, int yearOfBirth,
            String address, String phone, String faculty, int course, int group) {
        this.id = id;
        this.surname = lastName;
        this.name = name;
        this.middleName = middleName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    String getFaculty() {
        return faculty;
    }

    int getYearOfBirth() {
        return yearOfBirth;
    }

    int getCourse() {
        return course;
    }

    int getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (dayOfBirth != student.dayOfBirth) return false;
        if (monthOfBirth != student.monthOfBirth) return false;
        if (yearOfBirth != student.yearOfBirth) return false;
        if (course != student.course) return false;
        if (group != student.group) return false;
        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (middleName != null ? !middleName.equals(student.middleName) : student.middleName != null) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        if (phone != null ? !phone.equals(student.phone) : student.phone != null) return false;
        return faculty != null ? faculty.equals(student.faculty) : student.faculty == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + dayOfBirth;
        result = 31 * result + monthOfBirth;
        result = 31 * result + yearOfBirth;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + course;
        result = 31 * result + group;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}


