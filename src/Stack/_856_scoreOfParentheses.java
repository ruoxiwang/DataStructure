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

    int scoreOfParentheses2(String s) {
        int result = 0, sLen = s.length();
        for (int i = 0; i < sLen; ++i) {
            if (s.charAt(i) == ')') continue;;
            int pos = i+1, count = 1;
            while (count != 0) {
                if ((s.charAt(pos++) == '(')) {
                    ++count;
                } else {
                    --count;
                }
            }
            int cur = scoreOfParentheses(s.substring(i + 1, pos - i - 2));
            result += Math.max(2 * cur, 1);
            i = pos - 1;
        }
        return result;
    }
}
