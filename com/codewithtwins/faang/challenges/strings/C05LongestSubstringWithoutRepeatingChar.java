package com.codewithtwins.faang.challenges.strings;


import java.util.HashMap;
import java.util.HashSet;

public class C05LongestSubstringWithoutRepeatingChar {

    public int lenthOfLongestSubstring(String s) {
        if(s.length() <= 1) {
            return  s.length();
        }
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<String> seenCharacters = new HashSet<>();
            int currentLength = 0;
            for (int j = i; j < s.length(); j++) {
                  String currentChar = s.substring(j, j+1);
                  if(!seenCharacters.contains(currentChar)) {
                      seenCharacters.add(currentChar);
                      currentLength++;
                      longest = Math.max(longest, currentLength);
                  } else {
                      break;
                  }
            }
        }
        return longest;
    }

    public int optimizeLenthOfLongestSubstring(String s) {
        if(s.length() <= 1) {
            return  s.length();
        }
        int left = 0;
        int longest = 0;
        HashMap<String, Integer> seenCharacters = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            String currentChar = s.substring(right, right+1);
            Integer prevSeenChar = seenCharacters.get(currentChar);
            if(prevSeenChar != null && prevSeenChar >= left) {
                left = prevSeenChar + 1;
            }
            seenCharacters.put(currentChar, right);
            longest = Math.max(longest, (right-left)+1);

        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(new C05LongestSubstringWithoutRepeatingChar().optimizeLenthOfLongestSubstring("abcdaac"));
    }
}
