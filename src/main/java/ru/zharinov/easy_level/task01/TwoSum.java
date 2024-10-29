package ru.zharinov.easy_level.task01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] array1 = {2, 7, 11, 15}; //target = 9
        int[] array2 = {1, 5, 7, 2, 16, 3, 9}; //target = 16
        int[] array3 = {3, 2, 4}; //target = 6
        System.out.println(Arrays.toString(twoSum(array2, 16)));
        System.out.println(Arrays.toString(sumPfTwoNumbers(array2, 16)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] newArray = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    newArray[0] = i;
                    newArray[1] = j;
                }
            }
        }
        return newArray;
    }

    public static int[] sumPfTwoNumbers(int[] nums, int target) {
        int[] newArray = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int resultOfTwoNumbers = target - nums[i];
            if (map.containsKey(resultOfTwoNumbers)) {
                newArray[0] = map.get(resultOfTwoNumbers);
                newArray[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return newArray;
    }
}
