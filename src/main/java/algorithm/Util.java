package algorithm;

import java.util.Arrays;

public class Util {
    // Returns the distance between the two closest numbers.
    public static int closestDistanceNumbers(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Input array should have at least two elements");
        }

        // Sort the array to make it easier to find the closest numbers
        Arrays.sort(nums);

        int minDistance = Integer.MAX_VALUE;

        // Iterate through the array and find the minimum difference between adjacent elements
        for (int i = 1; i < nums.length; i++) {
            int currentDistance = nums[i] - nums[i - 1];
            minDistance = Math.min(minDistance, currentDistance);
        }

        return minDistance;
    }
    public static void main(String[] args) {
        int[] testArray = { 3, 9, 50, 15, 99, 7, 98, 65 };
        int result = closestDistanceNumbers(testArray);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}