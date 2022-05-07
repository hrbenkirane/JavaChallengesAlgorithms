package com.codewithtwins.codility.challenges.prefixsums;

// given three integers, A, B and K returns the number of integers within the range [A..B] that are divisible by K
public class C11CountDiv {
    public int solution(int A, int B, int K) {
        int base = (int) Math.ceil((double)A/K);
        base = base * K;
        B = B - base;

        int count = (int)Math.floor((double)B/ K);
        count = count + 1;
        return count;
    }

    public static void main(String[] args) {
        C11CountDiv cd = new C11CountDiv();
        System.out.println(cd.solution(6, 11, 1));
    }
}
