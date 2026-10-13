package com.javarush.demo;

import java.io.*;

public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {

        try (FileWriter writer = new FileWriter("hello.txt")) {
            writer.write("Привет!");
        }

        System.out.println("FileReader: ");
        try (Reader reader = new FileReader("hello.txt")) {
            printAll(reader);
        }

        System.out.println("InputStreamReader: ");
        try (InputStream bytes = new FileInputStream("hello.txt");
             Reader reader = new InputStreamReader(bytes)) {
            printAll(reader);
        }

        System.out.println("Байты того же файла: ");
        try (InputStream bytes  = new FileInputStream("hello.txt")) {
            System.out.println(bytes.readAllBytes().length); // 13
        }

    }

    private static void printAll(Reader reader) throws IOException {
        int c;
        while ((c = reader.read()) != -1) {
            System.out.print((char) c);
        }
        System.out.println();
    }


}
