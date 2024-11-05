package com.keanu.software.one;

/**
 * <p>
 *  练习数值计算。
 *  找出一个整数数组中子数组之和的最大值，
 *  例如：数组[1, -2, 3, 5, -1]，返回8（因为符合要求的子数组是 [3, 5]）；
 *  数组[1, -2, 3, -8, 5, 1]，返回6（因为符合要求的子数组是 [5, 1]）;
 *  数组[1, -2, 3,-2, 5, 1]，返回7（因为符合要求的子数组是 [3, -2, 5, 1]）。
 * </p>
 *
 * @author <a href="https://github.com/Li-Keanu">keanu</a>
 * @since 2024/9/10 10:14
 */
public class Two {
    public static void main(String[] args) {
        int[] nums1 = {1, -2, 3, 5, -1};
        int[] nums2 = {1, -2, 3, -8, 5, 1};
        int[] nums3 = {1, -2, 3, -2, 5, 1};

        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
