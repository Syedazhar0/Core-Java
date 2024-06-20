package Collections;

import java.util.*;

public class CreateHashMapExample {
    public static void main(String [] args){

        // example to map numbers to string

        Map<String,Integer> numberMapping = new HashMap<>();

        // add key_value to map

        numberMapping.put("one",1);
        numberMapping.put("two",2);
        numberMapping.put("three",3);
        numberMapping.put("four",4);
        numberMapping.put("five",5);
        numberMapping.put("six",6);
        numberMapping.put("seven",7);
        numberMapping.put("eight",8);

        System.out.println(numberMapping);

        // check if a  HashMap is empty
        System.out.println(numberMapping.isEmpty());

        //Find the size of a HashMap
        System.out.println(numberMapping.size());

        System.out.println("************************");
        // check if the key exist in the hashmap
        if (numberMapping.containsKey("four")){
            System.out.println("exist");
        }else{
            System.out.println("not exist");
        }

        System.out.println("************************");
        if (numberMapping.containsValue(1)){
            System.out.println("exist");
        }else{
            System.out.println("not exist");
        }

        System.out.println("************************");
        // get value by key
        Integer va1 = numberMapping.get("one");
        System.out.println(va1);

        System.out.println("************************");
        // remove vby key
        numberMapping.remove("one");
        System.out.println(numberMapping);

        System.out.println("************************");
        // get only keys from hashmap
        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        Collection<Integer> values = numberMapping.values();
        System.out.println(values);

        System.out.println("************************");
        // different ways to iterate over hashmap
        // for each method
        for(Map.Entry<String,Integer> entry :numberMapping.entrySet()){
            System.out.println("key->"+entry.getKey()+"value->"+entry.getValue());
        }

        System.out.println("************************");
        // using iterator
        Set<Map.Entry<String,Integer>> entries = numberMapping.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry =iterator.next();
            System.out.println("key->"+entry.getValue()+"value->"+entry.getValue());
        }

        System.out.println("************************");
        // hashmap using java 8 forEach
        numberMapping.forEach((K,V)->{
            System.out.println("K" + K);
            System.out.println("V" + V);
        });


    }
}
