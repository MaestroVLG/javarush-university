package com.javarush.demo.decorator;

public class PrefixNotifier implements Notifier {

    private final Notifier component;
    private final String prefix;

    public PrefixNotifier(Notifier component, String prefix) {
        this.component = component;
        this.prefix = prefix;
    }

    @Override
    public void send(String text) {
        component.send(prefix + text);
    }
}
