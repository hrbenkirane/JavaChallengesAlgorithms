package com.codewithtwins.bootcamp.challenges;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForumCropper {
    public int solution(int[] A) {
        double desiredPolution = Arrays.stream(A).sum() / 2;
        int totalCounterOfFilters = 0;
        double filteredPolution = 0;

        A = Arrays.stream(A).sorted().toArray();
        for (int i = A.length -1; i >= 0; i--)
        {
            totalCounterOfFilters++;
            filteredPolution += (double)A[i] / 2;
            if (filteredPolution >= desiredPolution)
                break;
        }
        return totalCounterOfFilters;
    }

    public static void main(String[] args) {
        System.out.println(new ForumCropper().solution(new int[] {5,19,8,1}));
        System.out.println(new ForumCropper().solution(new int[] {10, 10}));
    }
}
