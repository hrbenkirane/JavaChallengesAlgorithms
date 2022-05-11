package com.codewithtwins.bootcamp.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class C05CountVowelsAndConsonants {
    private static final Set<Character> allVowels
            = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static HashMap<Long, Long> countVowelsAndConsonants(String str) {
        HashMap<Long, Long> result = new HashMap<>();
        str = str.toLowerCase();

        long vowels = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();

        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch<= 'z'))
                .count();
        result.put(vowels, consonants);
        return result;
    }
}
