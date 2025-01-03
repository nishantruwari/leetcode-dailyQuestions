class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        int n=0;;

        for(int i:nums){
            sum+=i;
            ++n;
        }
        int count=0;
        long presum=0;
        

        for(int i=0;i<n-1;i++){
            presum+=nums[i];
            if(presum>=sum-presum){
                ++count;
            }

        }

        return count;
        
    }
}
