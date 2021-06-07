package Stack;

import java.util.HashMap;
import java.util.Stack;

public class _20_vaildParameters {
    private static HashMap<Character, Character> map = new HashMap<>();

    static {
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
    }
    public boolean isVaild3(String s) {
        Stack<Character> stack = new Stack<>();

        int stringLen = s.length();
        for (int i = 0; i < stringLen; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (c != map.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isVaild2(String s) {
        Stack<Character> stack = new Stack<>();

        int stringLen = s.length();
        for (int i = 0; i < stringLen; i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char left = stack.pop();
                if (left == '(' && c != ')') return false;
                if (left == '{' && c != '}') return false;
                if (left == '[' && c != ']') return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isVaild(String s) {
         while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
             s = s.replace("{}", "");
             s = s.replace("[]", "");
             s = s.replace("()", "");
         }
         return s.isEmpty();
    }
}
