package leetcode_cn;

import java.util.Deque;
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
        Deque<Character> stack = new LinkedList<>();
        /*
        * Stack是继承自Vector的，使用数组实现，增删慢，读取快，线程安全。
        * LinkedList继承自Queue-->Deque，使用双向链表实现，增删快，查找慢，优先使用
        * */
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
