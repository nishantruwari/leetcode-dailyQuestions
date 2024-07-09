class Solution {
    public double averageWaitingTime(int[][] customers) {
        int l = customers.length;

        int[] ct = new int[l + 1];
        int[] wt = new int[l];
        double ans = 0;
        ct[0] = 0;

        for (int i = 0; i < l; i++) {
            ct[i + 1] = Math.max(customers[i][0], ct[i]) + customers[i][1];
            wt[i] = ct[i + 1] - customers[i][0];
            ans += wt[i];
        }
        return ans / l;

    }
}