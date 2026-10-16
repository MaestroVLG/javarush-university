package com.javarush.demo.decorator.path;

import java.nio.file.Path;

public class PathCreateDemo {

    public static void main(String[] args) {

        Path report = Path.of("docs/2026/report.txt");
        System.out.println("Путь: " + report);

        Path sameReport = Path.of("docs", "2026", "report.txt");

        System.out.println("Из частей: " + sameReport);
        System.out.println("Пути равны? " + report.equals(sameReport));

        System.out.println("Настоящий класс объекта: " + report.getClass().getSimpleName());
    }

}
