package com.javarush.demo;

import java.io.*;

public class ByteVsCharDemo {

    public static void main(String[] args) throws IOException {

        // символы: Hi, Мир!
        String text = "Hi, Мир!";
        // байты: 010101010...(-1 - конец)
        byte[] bytes = text.getBytes();

        System.out.println("Символов в строке: " + text.length()); // 8
        System.out.println("Байт в строке: " + bytes.length); // 1

        System.out.println("InputStream читает байты:");

        try(InputStream in = new ByteArrayInputStream(bytes)) {
            int b;
            while ((b = in.read()) != -1) {
                System.out.print(b + " ");
            }
        }
        System.out.println();

        System.out.println("Reader читает символы:");

        try(Reader reader = new StringReader(text)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c + " ");
            }
        }
        System.out.println();

    }

}
