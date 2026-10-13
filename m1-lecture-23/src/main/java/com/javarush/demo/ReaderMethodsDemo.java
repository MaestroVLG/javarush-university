package com.javarush.demo;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ReaderMethodsDemo {

    public static void main(String[] args) throws IOException {

        try (Reader reader = new StringReader("Привет, Мир!")) {

            System.out.println("ready: " + reader.ready()); // ready: true

            int first = reader.read();
            System.out.println("read(): " +  first + " = " + (char) first); // read(): 1055 = П

            long skipped = reader.skip(7);
            System.out.println("skip(7)  пропустил: " + skipped); // skip(7)  пропустил: 7

            char[] buffer = new char[10];
            int count = reader.read(buffer);
            System.out.println("read(buffer) прочитал " + count + " " + new String(buffer, 0, count)); // read(buffer) прочитал 4 Мир!

            System.out.println("read() в конце потока: " + reader.read()); // read() в конце потока: -1

        }

    }

}
