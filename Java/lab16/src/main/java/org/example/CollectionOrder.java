package org.example;

import java.util.Iterator;

public class CollectionOrder implements Iterable<Order> {
    private final Order[] items;
    private int size;

    public CollectionOrder(int capacity) {
        items = new Order[capacity];
        size = 0;
    }

    public void addOrder(Order item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }

    @Override
    public Iterator<Order> iterator() {
        return new CollectionIterator();
    }
    private class CollectionIterator implements Iterator<Order> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Order next() {
            return items[currentIndex++];
        }
    }
}
