package com.codewithtwins.codility.challenges.countingelements;

import java.util.HashSet;

public class C10PermCheck {

    public int solution(int[] A) {
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 1; i < A.length + 1; i++) {
            nums.add(i);
        }
        for(int a : A) {
            if(!nums.contains(a)) {
                return 0;
            } else {
                nums.remove(a);
            }
        }
        return nums.isEmpty() ? 1  : 0;
    }

    public static void main(String[] args) {
        System.out.println(new C10PermCheck().solution(new int[] { 4, 1, 3, 2}));
        System.out.println(new C10PermCheck().solution(new int[] { 1 }));
    }
}
