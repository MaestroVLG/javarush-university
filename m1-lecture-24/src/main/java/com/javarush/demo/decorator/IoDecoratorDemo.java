package com.javarush.demo.decorator;

import java.io.*;

public class IoDecoratorDemo {

    public static void main(String[] args) throws IOException {

        // 'п' 'е' 'р' ...
        byte[] data = "первая\nвторая\nтретья\n".getBytes();

        InputStream bytes = new ByteArrayInputStream(data); // п е р ...

        Reader chars = new InputStreamReader(bytes);

        try (LineNumberReader lines = new LineNumberReader(chars)) {
            String line;
            while ((line = lines.readLine()) != null) { // .readLine() <=> `\n`
                System.out.println(lines.getLineNumber() + ": " + line);
            }
        }

    }

}
