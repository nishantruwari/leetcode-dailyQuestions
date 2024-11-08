class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {

        //max= 2^n
        int max=(int)Math.pow(2,maximumBit);
        //since max can be when all set bit is 1. so for max=4 max can be 3 =>111
        max=max-1;
        int n=nums.length;

        int [] ans=new int[n];
        int xor=nums[0];

        //xor=xor of all 

        for(int i=1;i<n;i++){
           
            xor^=nums[i];

        }
        xor^=max;
        ans[0]=xor;
       
        
         for(int i=1;i<n;i++){
           
            ans[i]=ans[i-1]^nums[n-i];

         }

        return ans;
        
    }
}
