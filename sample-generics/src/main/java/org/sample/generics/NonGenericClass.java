package org.sample.generics;

import java.util.*;

public class NonGenericClass {

    public static void main(String[] args) {
        List commonList = new ArrayList();

        commonList.add("Test");

        Object inObjectForm = new String("Another string");

        commonList.add(inObjectForm);

        commonList.add(23);//because compiler trusts us to insert right type of data to the list

        processCommonList(commonList);
    }

    private static void processCommonList(List list){
        String data = (String)list.get(0);//The list is of object type but fetched data is of String type
        //because of which compiler forces us to cast the output type
        // type casting introduces type safety issue
        // in line 16 we inserted integer type as out list in line 8 is object type which allows any subclass of object class
        //which causes java runtime to throw ClassCastException at runtime
        System.out.println(data);
        //To solve this problem generics was introduced

    }
}

