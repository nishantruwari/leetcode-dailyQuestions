class Solution {

    // Method to check if the subarray starting at 'start' of length 'k' is sorted
    private boolean isSorted(int start, int k, int[] arr) {
        for (int i = start + 1; i < start + k; i++) {
            if (arr[i] <= arr[i - 1] ) {
                return false;
            }

            if(arr[i]-arr[i-1]!=1){
                return false;
            }
        }
        return true;
    }

    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // Check the first subarray of length k
        boolean sorted = isSorted(0, k, nums);
        ans[0] = sorted ? nums[k - 1] : -1;

        // Iterate over the remaining subarrays
        for (int i = 1; i <= n - k; i++) {
            if (sorted && nums[i + k - 1] ==nums[i + k - 2]+1) {
                // Extend the sorted subarray conditionally
                ans[i] = nums[i + k - 1];
            } else {
                // Recheck if the current subarray is sorted
                sorted = isSorted(i, k, nums);
                ans[i] = sorted ? nums[i + k - 1] : -1;
            }
        }

        return ans;
    }
}
