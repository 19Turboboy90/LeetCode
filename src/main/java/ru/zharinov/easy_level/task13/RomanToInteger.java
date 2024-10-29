package ru.zharinov.easy_level.task13;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III")); //3
        System.out.println(romanToInt("IX")); // 9
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); //1994
        System.out.println(romanToInt("CM")); //900
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int pre = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            var curr = map.get(s.charAt(i));
            if (curr < pre) {
                result -= curr;
            } else {
                result += curr;
            }
            pre = curr;
        }
        return result;
    }
}
