package ru.zharinov.easy_level.task09;

/*
Given an integer x, return true if x is a
palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1

Follow up: Could you solve it without converting the integer to a string?
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
