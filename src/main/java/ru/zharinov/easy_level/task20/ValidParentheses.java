package ru.zharinov.easy_level.task20;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
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
