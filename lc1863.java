class Solution {
    public void subset(int i,int[] nums,int[] sum,int currxor){
        if(i==nums.length){
            sum[0]+=currxor;
            return;

        }

        subset(i+1,nums,sum,currxor^nums[i]);
        subset(i+1,nums,sum,currxor);
    }
    public int subsetXORSum(int[] nums) {
        int sum[]=new int[1];
        
        subset(0,nums,sum, nums[0]);
        return sum[0];
        
    }
}
