package org.sample.generics;

import java.util.*;

public class Rules {

    public static void main(String[] args) {
//        List<int> primitivesList = new ArrayList<>(); // type argument can not be primitive types
        List<Integer> refTypeList = new ArrayList<>();
        refTypeList.add(10); // auto boxing is happening here which means the primitive number 10 is wrapped
        // in wrapper class Integer this object is inserted in the collection
        int number = refTypeList.get(0);// auto unboxing is happening here , fetched Integer object un
        // wrapped the number and made it available as primitive type
    }
}
