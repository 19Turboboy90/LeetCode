package ru.zharinov.easy_level.task58;
/*
https://leetcode.com/problems/length-of-last-word/description/
 */

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World")); //5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); //4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); //6
    }

    public static int lengthOfLastWord(String s) {
        var array = s.split(" ");
        return array[array.length - 1].length();
    }
}
