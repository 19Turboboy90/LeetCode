package ru.zharinov.easy_level.task20;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()"; //true
        String s2 = "()[]{}"; // true
        String s3 = "(]"; //false
        String s4 = "(("; //false
        String s5 = "([{}])"; //true
        String s6 = "(){}}{"; //false
        String s7 = "("; //false
        System.out.println(validParentheses(s7));
    }

    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!stack.isEmpty()) {
                        Character pop = stack.pop();
                        if ((ch == ')' && pop == '(') || (ch == ']' && pop == '[') || (ch == '}' && pop == '{')) {
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
