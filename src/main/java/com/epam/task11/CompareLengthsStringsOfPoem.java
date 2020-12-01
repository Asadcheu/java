package com.epam.task11;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

class CompareLengthsStringsOfPoem {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/poem.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)){
            ArrayList<String> list = new ArrayList<>();
            bufferedReader.lines().forEach(list::add);
            list.sort(Comparator.comparing(String::length));
            list.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
