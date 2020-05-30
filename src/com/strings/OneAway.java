package com.strings;

import java.util.ArrayList;
import java.util.List;

public class OneAway {
    public static void main(String[] args) {
        System.out.println(isOneOff("pale", "bake"));
    }

    public static boolean isOneOff(String s1, String s2) {
        String listStr = "";
        String testStr = "";
        if (s1.length() >= s2.length()) {
            listStr += s2;
            testStr += s1;
        } else {
            listStr += s1;
            testStr += s2;
        }
        List<Character> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < listStr.length(); i++) {
            list.add(listStr.charAt(i));
        }
        display(list);
        for (int i = 0; i < testStr.length(); i++) {
            char temp = testStr.charAt(i);
            if (list.contains(temp)) {
                list.remove(new Character(testStr.charAt(i)));
            } else {
                count++;
            }
        }
        return count == 1 ? true : false;
    }

    public static void display(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
