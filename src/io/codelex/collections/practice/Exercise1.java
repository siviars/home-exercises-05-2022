package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);

        //todo - replace array with a HashSet and print out the results
        Set<String> hashList = new HashSet<>(Arrays.asList(array));
        System.out.println(hashList);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<Integer, String> hashList2 = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashList2.put(i, array[i]);
        }
        System.out.println(hashList2);
    }
}
