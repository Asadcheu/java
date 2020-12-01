package com.epam.task10;

import java.io.*;
import java.util.ArrayList;

class PoemStringsInReverseOrder {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/poem.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/out.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            ArrayList<String> list = new ArrayList<>();
            bufferedReader.lines().forEach(list::add);
            for (int i = list.size() - 1; i >= 0; i--) {
                String stringOfPoem = list.get(i);
                bufferedWriter.write(stringOfPoem);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
