package ru.zharinov.easy_level.task14;

import java.util.Arrays;

/*
https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str1)); // Вывод: "fl"

        String[] str2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(str2)); // Вывод: ""
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
