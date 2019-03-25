package com.cezarydanilowski;

import java.lang.*;
import java.lang.reflect.Array;

/**
 * Class implements collection called queue
 */

public class Queue<T> {
    private T list[];
    private int assumedSize;
    private static int fromEnd;
    private static int toRemoveLast;

    public Queue(Class<T> clazz, int assumedSize) {
        this.assumedSize = assumedSize;
        fromEnd = assumedSize - 1;
        toRemoveLast = assumedSize - 1;
        final T[] list = (T[]) Array.newInstance(clazz, assumedSize);
        this.list = list;
    }

    public void add(T element) {
        list[fromEnd] = element;
        fromEnd -= 1;
    }

    public void removeFirst() {
        list[toRemoveLast] = null;
        toRemoveLast -= 1;
    }

    public void removeLast() {
        list[fromEnd + 1] = null;
        fromEnd += 1;
    }

    public T getFirst() {
        return list[toRemoveLast];
    }

    public T getLast() {
        return list[fromEnd];
    }
}
