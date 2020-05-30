package com.strings;

import java.util.*;

public class PermutationOfOther {
    public static void main(String[] args) {
        //System.out.println(isPermutation("hello", "ohelh"));
        System.out.println(isPermutation("hello", "ohell"));
    }

    public static boolean isPermutation(String str, String otherStr){
        char[] strArr = str.toCharArray();
        char[] otherstrArr = otherStr.toCharArray();
        display(strArr);
        display(otherstrArr);
        Arrays.sort(strArr);
        Arrays.sort(otherstrArr);
        display(strArr);
        display(otherstrArr);
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i] != otherstrArr[i]){
                return false;
            }
        }

        return true;
    }
    public static void display(char[] aa){
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i]+" ");
        }
        System.out.println();
    }
}
