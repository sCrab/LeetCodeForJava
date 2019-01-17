package leetcode_cn;

import java.util.LinkedList;
import java.util.Stack;

public class A_20ValidParentheses {
    public static void main(String[] args) {
        A_20ValidParentheses a = new A_20ValidParentheses();
        String s = "{}";
        System.out.println(a.isValid(s));
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}
