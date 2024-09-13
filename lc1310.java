class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int[queries.length];
        
        
        for(int i=0;i<queries.length;i++){

            int f=queries[i][0];
            int l=queries[i][1];
            int xor=arr[f];

            for(int j=f+1;j<=l;j++){
                xor=xor^arr[j];


            }
            ans[i]=xor;
        }

        return ans;
        
    }
}
