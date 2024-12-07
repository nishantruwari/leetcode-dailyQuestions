class Solution {

    public boolean isPossible(int[] nums,int mid, int maxop){

        int op=0;
        for(int i:nums){
            op+=i/mid;
            if(i%mid==0){
                --op;
            }
        }

        if(op<=maxop){
            return true;
        }
        return false;
    }
    public int minimumSize(int[] nums, int maxOperations) {

        int max=nums[0];

        for(int i:nums){
            if(max<i){
                max=i;
            }

        }
        int result=-1;


        int lb=1;
        int ub=max;

        while(lb<=ub){
            int mid=(lb+ub)/2;

            if(isPossible(nums,mid,maxOperations)){
                result=mid;
                ub=mid-1;
            }else{
                lb=mid+1;

            }
        }


        return result;
        
    }
}
