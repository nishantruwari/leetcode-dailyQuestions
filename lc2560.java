class Solution {
    public int minCapability(int[] nums, int k) {

        int start=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;

        for(int i: nums){
            if(i<start){
                start=i;
            }

            if(i>end){
                end=i;
            }
        }
        int ans=-1;


        while(start<=end){
            int mid=start+(end-start)/2;

            if(isRobPoss(mid,nums,k)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }



        }


        return ans;
        
    }

    public boolean isRobPoss(int capability,int[] nums,int k){
        int houseRobbed=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=capability){
                houseRobbed++;
                i++;
            }

            if(houseRobbed>=k) return true;
        }
        return false;
}
    }


    
