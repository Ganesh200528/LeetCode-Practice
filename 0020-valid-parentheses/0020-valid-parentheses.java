class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            ss.push(s.charAt(i));

            if (ss.peek() == ')') {
                ss.pop();

                if (ss.isEmpty() || ss.peek() != '(') {
                    return false;
                }
                ss.pop();
            }
            else if (ss.peek() == '}') {
                ss.pop();

                if (ss.isEmpty() || ss.peek() != '{') {
                    return false;
                }
                ss.pop();
            }
            else if (ss.peek() == ']') {
                ss.pop();

                if (ss.isEmpty() || ss.peek() != '[') {
                    return false;
                }
                ss.pop();
            }
        }

        return ss.isEmpty();
    }
}