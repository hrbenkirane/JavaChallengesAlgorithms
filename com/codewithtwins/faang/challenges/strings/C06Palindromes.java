package com.codewithtwins.faang.challenges.strings;

import java.util.regex.Pattern;

public class C06Palindromes {

    private String removeString(String s) {
        String pattern = "[^a-zA-Z0-9]";
        s = s.replaceAll(pattern, "").toLowerCase() ;
        return s;
    }
    boolean isPalindrome(String s) {
        String t = removeString(s);
        StringBuilder sb = new StringBuilder(t);
        return sb.reverse().toString().equals(t);
    }

    public boolean isAlmostPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(!s.substring(left, left+1).equals(s.substring(right, right +1))) {
                return validSubPalindrome(s, left+1, right) || validSubPalindrome(s, left, right -1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean validSubPalindrome(String s , int left, int right) {
        while(left < right) {
            if(!s.substring(left, left+1).equals(s.substring(right, right +1))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        //Palindrome
        System.out.println(new C06Palindromes().isPalindrome("aabaa")); // true
        System.out.println(new C06Palindromes().isPalindrome("aabbaa")); // true
        System.out.println(new C06Palindromes().isPalindrome("abc")); // false
        System.out.println(new C06Palindromes().isPalindrome("a")); // true
        System.out.println(new C06Palindromes().isPalindrome(" ")); // true
        System.out.println(new C06Palindromes().isPalindrome(" a man, a plan, a canal panama")); // true
        System.out.println("");
        System.out.println("");
        // almost palindrome
        System.out.println("---AlmostPalindrome--");
        System.out.println(new C06Palindromes().isAlmostPalindrome("raceacar")); //true
        System.out.println(new C06Palindromes().isAlmostPalindrome("abccdba")); //true
        System.out.println(new C06Palindromes().isAlmostPalindrome("abcdefdba")); //false
        System.out.println(new C06Palindromes().isAlmostPalindrome("")); //true
        System.out.println(new C06Palindromes().isAlmostPalindrome("a")); //true
        System.out.println(new C06Palindromes().isAlmostPalindrome("ab")); //true
    }
}
