package com.codewithtwins.faang.challenges;

public class C02ContainerWithMostWater {

    public int oSolution(int[] heights) {
        int p1 = 0;
        int p2 = heights.length - 1;
        int maxArea = 0;
        while(p1 < p2) {
            int height = Math.min(heights[p1], heights[p2]);
            int width = p2 - p1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            if(heights[p1] <= heights[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return maxArea;
    }


    public int solution(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length ; j++) {
                int height = Math.min(heights[i], heights[j]);
                int width = j - i;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(new C02ContainerWithMostWater().solution(new int[] {7, 1,2,3,9}));
        System.out.println(new C02ContainerWithMostWater().solution(new int[] {5}));
        System.out.println(new C02ContainerWithMostWater().oSolution(new int[] {4,8,1,2,3,9}));
    }
}
