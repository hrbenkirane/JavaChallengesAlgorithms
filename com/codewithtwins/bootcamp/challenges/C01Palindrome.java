package com.codewithtwins.bootcamp.challenges;

public class C01Palindrome {

    boolean isPalindrom(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(new C01Palindrome().isPalindrom("aabbaa"));
    }
}
