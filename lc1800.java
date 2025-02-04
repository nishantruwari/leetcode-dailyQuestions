class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum=nums[0];
        int sum=nums[0];
        int n=nums.length;

        for(int i=1;i<n;i++){
            if(nums[i-1]>=nums[i]){
                maxsum=Math.max(sum,maxsum);
                sum=0;
            }
            sum+=nums[i];



        }
        maxsum=Math.max(sum,maxsum);
        return maxsum;
    }
}
