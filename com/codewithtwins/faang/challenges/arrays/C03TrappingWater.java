package com.codewithtwins.faang.challenges.arrays;

public class C03TrappingWater {

    public int osolution(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int total = 0;

        while(left < right) {
            if(heights[left] <= heights[right]) {
                if(heights[left] >= maxLeft) {
                    maxLeft = heights[left];
                } else {
                    total += maxLeft - heights[left];
                }
                left++;
            } else {
                if(heights[right] >= maxRight) {
                    maxRight = heights[right];
                } else {
                    total += maxRight - heights[right];
                }
                right--;
            }
        }

        return total;
    }


    public int solution(int[] heights) {


        int totalWater = 0;

        for (int p = 0; p < heights.length; p++) {

            int leftP = p;
            int rightP = p;
            int maxLeft = 0;
            int maxRight = 0;

            while(leftP >= 0) {
                maxLeft = Math.max(maxLeft, heights[leftP]);
                leftP--;
            }
            while(rightP < heights.length) {
                maxRight = Math.max(maxRight, heights[rightP]);
                rightP++;
            }
            int currentWater = Math.min(maxLeft, maxRight) - heights[p];
            if(currentWater >= 0) {
                totalWater += currentWater;
            }
        }
        return totalWater;
    }

    public static void main(String[] args) {
        System.out.println(new C03TrappingWater().osolution(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(new C03TrappingWater().solution(new int[] {}));
        System.out.println(new C03TrappingWater().solution(new int[] {3}));
        System.out.println(new C03TrappingWater().solution(new int[] {3,4,3}));
    }
}
