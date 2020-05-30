package com.strings;

public class URlify {
    public static void main(String[] args) {
        String str = "Me John Smith";
        System.out.println(getURL(str));

    }
    public static String getURL(String str){

        String plus = "%20";
        String newStr = str.replace(" ", plus);
        return newStr;
    }
}
