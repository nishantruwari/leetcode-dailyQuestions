class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;++i){
            if(nums[i]==0 ){
                if(i+3>n){
                    return -1;
                }
                nums[i]=1;
                nums[i+1]=nums[i+1]==1?0:1;
                nums[i+2]=nums[i+2]==1?0:1;
                
                ++count;
                
            }

        }
        return count;
        
    }
}
