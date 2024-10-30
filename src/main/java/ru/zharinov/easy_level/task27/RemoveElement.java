package ru.zharinov.easy_level.task27;

import java.util.*;

/*
https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        System.out.println(removeElement(array, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
