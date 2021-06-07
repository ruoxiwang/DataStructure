package Stack;

import java.util.Stack;

public class _150_evaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        if (tokens.length == 1) return Integer.parseInt(tokens[0]);
        int len = tokens.length;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < len; ++i) {
            String item = tokens[i];
            if (!item.equals("+") && !item.equals("-") && !item.equals("*") && !item.equals("/")) {
                stack.push(item);
            } else {
                int number1 = Integer.parseInt(stack.pop());
                int number2 = Integer.parseInt(stack.pop());
                if (item.equals("+")) stack.push(Integer.toString(number2+number1));
                if (item.equals("-")) stack.push(Integer.toString(number2-number1));
                if (item.equals("*")) stack.push(Integer.toString(number2*number1));
                if (item.equals("/")) stack.push(Integer.toString(number2/number1));
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        String[] tokens = new String[] {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
