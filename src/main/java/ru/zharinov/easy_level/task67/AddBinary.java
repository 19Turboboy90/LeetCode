package ru.zharinov.easy_level.task67;
/*
https://leetcode.com/problems/add-binary/description/
 */

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11"; // В десятичной системе 11 = 3
        String b = "1"; // В десятичной системе 11 = 1
        // результат: 3 + 1 = 4. В двоичной 4 = 100;

        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        BigInteger number1 = new BigInteger(a, 2);
        BigInteger number2 = new BigInteger(b, 2);
        BigInteger sum = number1.add(number2);
        return sum.toString(2);
    }
}
