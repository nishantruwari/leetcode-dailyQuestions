class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].charAt(0) == '.') {
                if (logs[i].charAt(1) == '.') {
                    count = count == 0 ? 0 : --count;
                }
            } else {
                ++count;
            }
        }
        return count;

    }
}
