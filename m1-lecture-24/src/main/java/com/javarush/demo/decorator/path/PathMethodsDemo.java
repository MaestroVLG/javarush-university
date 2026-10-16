package com.javarush.demo.decorator.path;

import java.nio.file.Path;

public class PathMethodsDemo {

    public static void main(String[] args) {

        Path path = Path.of("/home/anna/projects/app/../appsrc/Main.java");

        System.out.println("Путь: " + path); // Путь: /home/anna/projects/app/../appsrc/Main.java

        System.out.println("getParent(): " + path.getParent());

        System.out.println("getFileName(): " + path.getFileName()); // getFileName(): Main.java

        System.out.println("getRoot(): " + path.getRoot());

        System.out.println("isAbsolute(): " + path.isAbsolute());

        Path clean = path.normalize();

        System.out.println("normalize(): " + clean);

        //    0    1     2        3     4
        // /home/anna/projects/appsrc/Main.java
        System.out.println("getName(0): " + clean.getName(0));
        System.out.println("getName(3): " + clean.getName(3));

        System.out.println("subpath(2, 4): " + clean.subpath(2, 4));

        System.out.println("startsWith /home: " + clean.startsWith(Path.of("/home")));
        System.out.println("endsWith Main.java: " + clean.endsWith(Path.of("Main.java")));

        System.out.println(clean.endsWith(Path.of("appsrc")));

    }

}
