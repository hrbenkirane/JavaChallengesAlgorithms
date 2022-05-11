package com.codewithtwins.bootcamp.challenges;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class C04CountDuplicateCharacters {

    Map<Character, Integer> result = new HashMap<>();
    public Map<Character, Integer> countDuplicateCharacters(String str) {
       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           result.compute(ch, (k, v) -> (v== null) ? 1 : ++v);
       }
       return result;
   }
    public Map<Character, Long> countDuplicateCharacters2(String str) {
        Map<Character, Long> result2 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result2;
    }
}
