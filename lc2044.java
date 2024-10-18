class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr=nums[0];
        for(int i=1;i<nums.length;i++){
            maxOr=maxOr|nums[i];

        }
        int or=0;
        return solve(0,nums,or,maxOr);
        
    }


    private int solve(int i,int[] nums, int or,int maxOr){

        if(i==nums.length){
            if(or==maxOr){
                return 1;
            }
            return 0;
        }

        int ans=0;

        //take
        ans+=solve(i+1,nums,or|nums[i],maxOr);
        // not take
        ans+=solve(i+1,nums,or,maxOr);

        return ans;
    }
}
