package com.codewithtwins.codility.challenges;

public class C04FrogJmp {
    public int solution(int x, int y, int D) {
        int distance = y - x;
        int jumps = (int) Math.ceil(distance / (double)D);

        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(new C04FrogJmp().solution(10, 85, 30));
    }
}
