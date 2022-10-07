package org.sample.generics;

import java.util.*;

public class GenericCode {

    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("pyhton");
        processList(languages);

    }

    private static void processList(List<String> data){
       String language = data.get(0);
        System.out.println(language);
    }
}
