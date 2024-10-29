package ru.zharinov.easy_level.task09;

/*
https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1312));
    }

    public static boolean isPalindrome(int x) {
        int rev;
        int i = 0;
        int originalNum = x;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            rev = x % 10;
            i = i * 10 + rev;
            x = x / 10;
        }
        return originalNum == i;
    }
}
