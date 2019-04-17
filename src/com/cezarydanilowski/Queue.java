package com.cezarydanilowski;

import java.lang.*;
import java.lang.reflect.Array;

/**
 * Class implements collection called queue
 */

public class Queue<T> {
    private T list[];
    private int assumedSize;
    private static int firstElement = 0;
    private static int lastElement = 0;

    public Queue(Class<T> clazz, int size) {
        this.assumedSize = size;

        @SuppressWarnings("unchecked")
        final T[] aList = (T[]) Array.newInstance(clazz, assumedSize);
        this.list = aList;
    }

    public void add(T element) {
        list[lastElement] = element;
        lastElement += 1;
    }

    public void removeFirst() {
        list[firstElement] = null;
        firstElement += 1;
    }

    public void removeLast() {
        list[lastElement - 1] = null;
        lastElement -= 1;
    }

    public void printQueue() {
        for (int i = 0; i < assumedSize; i++) {
            if (list[i] == null) System.out.print(" ");
            else System.out.print(list[i]);

            System.out.print(" ");
        }

        System.out.println();
    }

    public T getFirst() {
        return list[firstElement];
    }

    public T getLast() { return list[lastElement - 1]; }

    public int getLastElement() { return lastElement; }
}
