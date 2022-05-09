package com.codewithtwins.bootcamp.challenges;

public class C02ReverseInt {
    int reverseInt(int n) {
        String nString = Integer.toString(Math.abs(n));
        StringBuilder sb = new StringBuilder(nString);
        String reversed = sb.reverse().toString();
        if(n < 0) {
            return Integer.parseInt(reversed) * -1;
        }
        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        System.out.println(new C02ReverseInt().reverseInt(-512));
    }
}
