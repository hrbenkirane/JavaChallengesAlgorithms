package com.codewithtwins.inden.challenges;

import java.util.Map;

public class C01NumberAsText {
    static Map<Integer, String> valueToTextMap =
            Map.of(0, "ZERO", 1, "ONE", 2, "TWO", 3, "THREE", 4, "FOUR",
                    5, "FIVE", 6, "SIX", 7, "SEVEN", 8, "EIGHT", 9, "NINE");

    static String digitAsText(final int n) {
        return valueToTextMap.get(n % 10);
    }

    public static String numbersAsText(final int n) {
        String value = "";
        int remainingValue = n;
        while(remainingValue > 0) {
            String remainderAsText = digitAsText(remainingValue % 10);
            value = remainderAsText + " " + value;
            remainingValue = remainingValue / 10;
        }
        return value.trim();
    }

    public static void main(String[] args) {
        System.out.println(C01NumberAsText.numbersAsText(12345));
    }

}
