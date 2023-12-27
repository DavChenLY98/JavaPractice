package com.henry.Dec21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Character,Integer> hp=new HashMap<Character,Integer>();
        hp.put('a',1);
        hp.put('b',2);
        hp.put('c',3);
        hp.put('d',4);
        hp.put('e',5);

//        Set<Character> characters = hp.keySet();
//        lambda表达式
//        characters.forEach(character-> System.out.println(hp.get(character)));


//        迭代器
//        Iterator<Character> it =characters.iterator();
//        while(it.hasNext()){
//            Character character = it.next();
//            System.out.println(character);
//            Integer integer = hp.get(character);
//            System.out.println(integer);
//        }

//        增强for循环
//        for (Character character : characters) {
//            System.out.println(character);
//            Integer integer = hp.get(character);
//            System.out.println(integer);
//        }

    }
}
