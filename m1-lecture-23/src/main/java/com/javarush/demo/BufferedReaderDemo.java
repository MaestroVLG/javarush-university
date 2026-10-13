package com.javarush.demo;

import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        try (FileWriter writer = new FileWriter("menu.txt")) {
            writer.write("Борщ\n");
            writer.write("Пельмени\n");
            writer.write("Компот\n");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
            String line;
            int number = 1;
            while ((line = reader. readLine()) != null) {
                System.out.println(number + ". " + line);
                number++;
            }
        }

    }

}
