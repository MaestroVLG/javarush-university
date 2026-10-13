package com.javarush.demo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamMethodsDemo {

    public static void main(String[] args) throws IOException {

        byte[] data = "ABCDEFGHIJ".getBytes();

        try(InputStream in = new ByteArrayInputStream(data)){
            System.out.println("available: " + in.available()); // available: 10

            int first = in.read();
            System.out.println("read(): " + first + " = " + (char) first); // read(): 65 = A

            long skipped = in.skip(3);
            System.out.println("skip(3) пропустил: " + skipped); // skip(3) пропустил: 3

            byte[] buffer = new byte[4];
            int count = in.read(buffer);

            System.out.println("read(buffer) прочитал " + count + " " + new String(buffer, 0, count)); // read(buffer) прочитал 4 EFGH

            System.out.println("available: " + in.available()); // available: 2

            byte[] rest = in.readAllBytes();
            System.out.println("readAllBytes: " + new String(rest)); // readAllBytes: IJ

            System.out.println("read() в конце потока: " + in.read()); // read() в конце потока: -1

        }


    }

}
