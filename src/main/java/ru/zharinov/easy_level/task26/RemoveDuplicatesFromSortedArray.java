package ru.zharinov.easy_level.task26;

import java.util.*;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
