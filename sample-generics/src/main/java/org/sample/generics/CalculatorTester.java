package org.sample.generics;

import java.util.*;

public class CalculatorTester {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(10,30,20,80,60,70));
        Calculator<Integer> integerCalculator = new Calculator<>(integers);
        System.out.println(integerCalculator.getMaxValue());
        System.out.println(integerCalculator.getList());//Collections.max does not update the existing list
        System.out.println(integerCalculator.getSortedList());

     }
}
