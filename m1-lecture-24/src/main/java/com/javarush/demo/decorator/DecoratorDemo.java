package com.javarush.demo.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Notifier plain = new ConsoleNotifier();
        plain.send("Сервер перезапущен");

        Notifier loud = new UpperCaseNotifier(new ConsoleNotifier());
        loud.send("Сервер перезапущен");

        Notifier important = new PrefixNotifier(new ConsoleNotifier(), "[ВАЖНО] ");
        important.send("Сервер перезапущен");

        Notifier both = new PrefixNotifier(new UpperCaseNotifier(new ConsoleNotifier()), "[ВАЖНО] ");
        both.send("Сервер перезапущен");

    }

}
