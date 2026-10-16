package com.javarush.demo.decorator.nio;

import java.nio.ByteBuffer;

public class BufferNavigationDemo {

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.wrap("ABCDEF".getBytes());

        System.out.println("Позиция: " + buffer.position() + ", осталось: " + buffer.remaining());
        System.out.println("get: " + (char) buffer.get()); // 65 -> A (таблица кодировки ASCII)
        System.out.println("get: " + (char) buffer.get());
        System.out.println("get: " + (char) buffer.get());
        System.out.println("Позиция: " + buffer.position());

        buffer.position(1);
        System.out.println("Вернулись на позицию 1, get: " + (char) buffer.get());

        System.out.println("get (5) без сдвига: " + (char) buffer.get(5));

        System.out.println("Позиция не изменилась: " + buffer.position());

        buffer.rewind();

        System.out.println("rewind, get: " + (char) buffer.get());

    }

}
