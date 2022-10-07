package org.sample.generics;

import java.util.*;

public class TestTypeInference {

    public static void main(String[] args) {
        List<Integer> list = Collections.EMPTY_LIST;

        // as the reference variable is having integer type
        //the empty list will also be of integer type due to type inference
        //the compilation error shown in line 11 is proof of type of list created
        //list.add("test");


        Number number = pickOne(12, 123.33);
        System.out.println(number);

        Fruit fruit = new Fruit("Mango",23.09);
        Apple apple = new Apple("fuzi" , 140.00);

        Fruit pickedFruit = pickOne(fruit,apple);
        System.out.println(pickedFruit);

        // Here the returned value from pickOne method can be only stored in Fruit or
        // Above classes in the hierarchy like Boxable

        Boxable pickedFruitForBox = pickOne(fruit,apple);
        System.out.println(pickedFruitForBox);

        //Now if we change the refernce to returned object compiler starts throwing errors
        //uncomment line 34

        //Apple pickedFruitBox = pickOne(fruit,apple);

        //Type inference with method argument
        //Because the object passed to Box.of method is of Fruit type returned box object will be Fruit type
        //here based on parameter passed to method the object is getting created
        Box box = Box.of(fruit);
        System.out.println(box);

        //type inference with target types

        Box<Fruit> fruitBox = BoxUtils.emptyBox();//This time the compiler inferred the type based on target
        //variable fruitBox type in which you are going to store te results

        Box boxableBox = BoxUtils.emptyBox();//If you dont mention the type on refernce variable the compiler chaecks method
        //signature and see the T extends Boxable so it created an empty box of Boxable types


    }

    public static <T> T pickOne(T t1, T t2) {
        if (Math.random() > 0.5) {
            return t1;
        }
        return t2;
    }
}
