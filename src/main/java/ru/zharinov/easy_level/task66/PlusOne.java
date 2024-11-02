package ru.zharinov.easy_level.task66;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3}; //[1,2,4]
        int[] array2 = {4, 3, 2, 1}; //[4,3,2,2]
        int[] array3 = {9}; //[1,0]
        int[] array4 = {9, 9}; //[9,1,0]

        System.out.println(Arrays.toString(plusOne(array1)));
        System.out.println(Arrays.toString(plusOne(array2)));
        System.out.println(Arrays.toString(plusOne(array3)));
        System.out.println(Arrays.toString(plusOne(array4)));
    }

    public static int[] plusOne(int[] digits) {
        var str = Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        BigDecimal number1 = new BigDecimal(str);
        BigDecimal number2 = new BigDecimal("1");
        var summa = number1.add(number2);
        String[] splitString = String.valueOf(summa.toString()).split("");

        int[] result = new int[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            result[i] = Integer.parseInt(splitString[i]);
        }

        return result;
    }

//    public static int[] plusOne(int[] digits) {
//        BigDecimal number2 = new BigDecimal("1");
//        StringBuilder builder = new StringBuilder();
//        for (int digit : digits) {
//            builder.append(digit);
//        }
//        BigDecimal number1 = new BigDecimal(builder.toString());
//        BigDecimal summa = number1.add(number2);
//
//        String[] splitString = String.valueOf(summa.toString()).split("");
//
//        int[] result = new int[splitString.length];
//
//        for (int i = 0; i < splitString.length; i++) {
//            result[i] = Integer.parseInt(splitString[i]);
//        }
//
//        return result;
//    }
}
