package com.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepaeatingChar {

    public static void main(String[] args) {
        String str = "eaappke";
        System.out.println(findFirstNonRepChar(str));
    }

    public static char findFirstNonRepChar(String str) {
        char repChar = 0;
        Map<Character, Integer> mapp = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(!mapp.containsKey(temp)){
                mapp.put(new Character(temp), 1);
            }
            else {
                mapp.put(new Character(temp), mapp.get(temp)+1);
            }

        }
        System.out.println(mapp);
        for (int i = 0; i < str.length(); i++) {
            if(mapp.get(str.charAt(i)) == 1){
                repChar = str.charAt(i);
                break;
            }
        }

        return repChar;
    }
}
