package ru.zharinov.easy_level.task35;
/*
https://leetcode.com/problems/search-insert-position/description/
 */

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};
        int[] array2 = {1, 3, 5, 6};
        System.out.println(searchInsert(array2, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        var searchElement = Arrays.binarySearch(nums, target);
        if (searchElement < 0) {
            return Math.abs(searchElement + 1);
        }
        return searchElement;
    }
}
