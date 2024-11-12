import java.util.Arrays;

class Solution {
    public static void sortArr(int[][] arr) {
        Arrays.sort(arr, (x, y) -> Integer.compare(x[0], y[0]));
    }

    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Sort items by price
        sortArr(items);

        // Calculate the max beauty till now for each price level
        int[][] maxtillnow = new int[items.length][2];
        maxtillnow[0][0] = items[0][0];
        maxtillnow[0][1] = items[0][1];
        
        int index = 1;
        for (int i = 1; i < items.length; i++) {
            // Update max beauty for the same price level
            if (items[i][0] == maxtillnow[index - 1][0]) {
                maxtillnow[index - 1][1] = Math.max(maxtillnow[index - 1][1], items[i][1]);
            } else {
                // Move to next price level
                maxtillnow[index][0] = items[i][0];
                maxtillnow[index][1] = Math.max(maxtillnow[index - 1][1], items[i][1]);
                index++;
            }
        }

        // Resize maxtillnow to valid entries only
        maxtillnow = Arrays.copyOf(maxtillnow, index);

        // Process queries using binary search
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int price = queries[i];

            // Binary search to find the max beauty for price <= query
            int left = 0, right = index - 1, maxBeauty = 0;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (maxtillnow[mid][0] <= price) {
                    maxBeauty = maxtillnow[mid][1];
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            result[i] = maxBeauty;
        }

        return result;
    }
}
