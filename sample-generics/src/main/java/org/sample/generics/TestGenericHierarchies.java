package org.sample.generics;

public class TestGenericHierarchies {

    public static void main(String[] args) {

        CardBoardBox<Fruit> fruitCardBoardBox = new CardBoardBox<>();
        Box<Fruit> fruitBox = new Box<>();

        fruitBox = fruitCardBoardBox;

        //Type hierarcheis demo
        Box<Apple> appleBox = new Box<>();
        //fruitBox=appleBox; //because there is no exect match on the type provided in angle brackets
    }
}
