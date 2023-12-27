package com.henry.Dec21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class HashMapTestDemo02 {
    public static void main(String[] args) {
        Map<Character,Integer> hp=new HashMap<>();
        hp.put('a',1);
        hp.put('b',2);
        hp.put('c',3);
        hp.put('d',4);
        hp.put('e',5);

        Set<Map.Entry<Character, Integer>> entries = hp.entrySet();

        entries.forEach(characterIntegerEntry->System.out.println(characterIntegerEntry.getKey()));





        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            Character key = next.getKey();
            System.out.println(next.getKey());
            System.out.println(next.getValue());

        }


//        for (Map.Entry<Character, Integer> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }
}
