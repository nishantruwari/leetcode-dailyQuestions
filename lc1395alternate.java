class Solution {
    public int numTeams(int[] rating) {
        int ans = 0;
        int n = rating.length;
        for (int i = 1; i < n - 1; i++) {
            int lsmaller = 0, rlarger = 0;
            for (int j = 0; j < i ; j++) {
                if (rating[j] < rating[i]) {
                    lsmaller++;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) {
                    rlarger++;
                }
            }
            ans += lsmaller * rlarger;
            int llarger, rsmaller;
            llarger = i - lsmaller;
            rsmaller = n - i - 1 - rlarger;
            ans += llarger * rsmaller;

        }
        return ans;

    }
}