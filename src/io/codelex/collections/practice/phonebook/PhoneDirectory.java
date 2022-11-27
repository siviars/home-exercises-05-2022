package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {

    private TreeMap<Integer, PhoneEntry> phoneBook = new TreeMap<>();
    private int dataCount;

    public PhoneDirectory() {
        dataCount = 0;
    }

    private int find(String name) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            return phoneBook.get(position).getNumber();
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int i = find(name);
        if (i >= 0) {
            phoneBook.get(i).setNumber(number);
        } else {
            PhoneEntry newEntry = new PhoneEntry();  // Create a new pair.
            newEntry.name = name;
            newEntry.number = number;
            phoneBook.put(dataCount, newEntry);
            dataCount++;


        }
    }


}
