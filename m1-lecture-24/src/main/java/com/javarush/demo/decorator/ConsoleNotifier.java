package com.javarush.demo.decorator;

public class ConsoleNotifier implements Notifier {

    @Override
    public void send(String text) {
        System.out.println(text);
    }
}
