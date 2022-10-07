package org.sample.generics;

public final class BoxUtils {

    public static <T extends Boxable> int getItemCount(Box<T> box) {
        return box.getItems().size();
    }

    public static int getItemCountUsingWildCards(Box<?> box) {
        return box.getItems().size();
    }

    public static <T extends Boxable> Box<T> emptyBox() {
        return new Box<>();
    }

    public static void addApplesToBox(Box<? super Apple> apples){
        apples.addItem(new Apple("fuzzi" ,180.00));
    }
    public static double getAveragePriceOfFruit(Box<? extends Fruit> fruits) {
        return fruits.getItems().stream().mapToDouble(Boxable::getPrice).sum() / fruits.getItems().size();
    }
}
