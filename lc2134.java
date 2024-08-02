class Solution {
    public int minSwaps(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i==1)
                ++count;
        }
        int incount=0;
        int n=nums.length;
        int maxcount=0;
        int l=0;

        for(int r=0;r<nums.length*2;r++){
            if(nums[r%n]==1){
                incount++;

            }
            if(r-l+1>count){
                incount-=nums[l%n];
                ++l;
            }
            maxcount=Math.max(maxcount,incount);


        }
        return count-maxcount;

    }
}
