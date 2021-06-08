package Stack;

import java.util.Stack;

public class _224_basicCalculator {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sLen = s.length(), sign = 1, result = 0;
        for (int i = 0; i < sLen; ++i) {
            char c = s.charAt(i);
            if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result *= stack.pop(); //pop sign
                result += stack.pop(); //pop last result
            } else if (c >= '0') {
                System.out.println(c);
                int number = 0;
                while (i < sLen && s.charAt(i) >= '0') {
                    number = 10 * number + (s.charAt(i++) - '0');
                }
                result += sign * number;
                --i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}

