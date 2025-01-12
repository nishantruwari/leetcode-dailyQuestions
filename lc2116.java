class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;

        }
        Stack<Integer> open = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        if (s.charAt(0) == ')' && locked.charAt(0) == '1') {
            return false;
        }

        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                unlocked.push(i);

            } else {
                if (s.charAt(i) == ')') {
                    if (!open.empty()) {
                        open.pop();
                    } else {
                        if (!unlocked.empty()) {
                            unlocked.pop();
                        } else {
                            return false;
                        }
                    }
                } else {
                    open.push(i);
                }

            }
        }

        while (!open.empty() && !unlocked.empty()) {
            if (open.peek() < unlocked.peek()) {
                open.pop();
                unlocked.pop();
            } else {
                return false;
            }
        }
return open.isEmpty();

    }
}
