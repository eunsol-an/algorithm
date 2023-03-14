import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if(isValid(rotated)) answer++;
        }

        return answer;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if(ch == ')' && top != '(') {
                    return false;
                } else if(ch == ']' && top != '[') {
                    return false;
                } else if(ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}