package com.codewithtwins.gayle.challenges;

import java.util.Arrays;

public class C01Arrays {

    boolean isUniqueChars(String str) {
        if(str.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) { // already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    // check if two strings are permutations meaning they have the same characters but in different orders
    boolean permutation(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i =0;

        //count the spaces in the string
        for (i = 0;  i < trueLength ; i++) {
            if(str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;
        if(trueLength < str.length) {
            str[trueLength] = '\0'; // End array
        }

        for (i = trueLength -1; i>=0; i--) {
            if(str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive= 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            // if the next character is different than current, append this char to result.
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    void setZero(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        // Store the row and column index with value 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
    }

    boolean isRotation(String s1, String s2) {
        int len = s1.length();
        // check that s1 und s2 are equal lenth and not empty
        if(len == s2.length() && len > 0) {
            // Concatenate s1 and s1 within new buffer
            String s1s1 = s1 + s1;
            return s1s1.contains(s2);
        }
        return false;
    }

}
