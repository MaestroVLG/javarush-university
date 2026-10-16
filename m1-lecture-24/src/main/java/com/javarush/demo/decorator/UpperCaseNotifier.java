package com.javarush.demo.decorator;

public class UpperCaseNotifier implements Notifier {

    // Поле (свойство)
    private final Notifier component;

    // Конструктор класса
    public UpperCaseNotifier(Notifier component) {
        this.component = component;
    }

    @Override
    public void send(String text) {
        component.send(text.toUpperCase());
    }
}
