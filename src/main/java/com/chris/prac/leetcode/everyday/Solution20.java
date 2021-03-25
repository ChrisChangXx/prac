package com.chris.prac.leetcode.everyday;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * solution20
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * @author zhangh
 * @date 2021/03/18
 */
public class Solution20 {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(' | aChar == '[' | aChar == '{') {
                stack.push(aChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (!map.get(aChar).equals(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }
}
