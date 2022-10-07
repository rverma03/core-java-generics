package org.sample.generics;

import java.util.*;

public class Box<T extends Boxable> {

    List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public T getLatestItem() {
        return this.items.get(items.size() - 1);
    }


    public static <T extends Boxable> Box<T> of(T t) {
        Box<T> box = new Box<>();
        box.addItem(t);
        return box;
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Boxable::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }

}
