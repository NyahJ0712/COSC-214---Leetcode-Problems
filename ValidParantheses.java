class Solution {
    public boolean isValid(String s) {
        // A valid string must have an even length
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // If it's a closing bracket, stack must not be empty
                // and the top element must match
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // All brackets must have been matched and popped
        return stack.isEmpty();
    }
}
