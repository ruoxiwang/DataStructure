package Stack;

import java.util.Stack;

public class _856_scoreOfParentheses {
    int scoreOfParentheses(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        int sLen = s.length();
        for (int i = 0; i < sLen; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(result);
                result = 0;
            } else {
                result = stack.pop() + Math.max(result*2, 1);
            }
        }
        return result;
    }
}
