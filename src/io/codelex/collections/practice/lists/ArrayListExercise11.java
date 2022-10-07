package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> myList = new ArrayList<>();

        //TODO: Add 10 values to list
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");
        myList.add("six");
        myList.add("seven");
        myList.add("eight");
        myList.add("nine");
        myList.add("ten");

        //TODO: Add new value at 5th position
        myList.add(5, "newPosition");

        //TODO: Change value at last position (Calculate last position programmatically)
        myList.add(myList.size(), "Last element");

        //TODO: Sort your list in alphabetical order
        Collections.sort(myList);

        //TODO: Check if your list contains "Foobar" element
        myList.contains("Foobar");

        //TODO: Print each element of list using loop
        for (String numbers : myList) {
            System.out.println(numbers);
        }
    }

}
