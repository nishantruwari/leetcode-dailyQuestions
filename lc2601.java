class Solution {

    public boolean isP(int n){
     //    System.out.println(n);
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public boolean primeSubOperation(int[] nums) {
        int n=nums.length;
        for(int j=nums[0]-1;j>=2;j--){
                //int flag=0;
               // System.out.println(isP(4));
                if(isP(j)){
                    nums[0]-=j;
                    break;
                }
        }

        for(int i=1;i<n;i++){
            int num=nums[i];

            for(int j=num-1;j>=2;j--){
                if(isP(j)&& nums[i]-j>nums[i-1]){
                    nums[i]-=j;
                    break;
                }
            }

            if(nums[i]<=nums[i-1]){
                return false;
            }
        }
      //  System.out.println(nums[0]);

        // for(int i=1;i<n;i++){

        //   //  System.out.println(nums[i]);
        //     if(nums[i]<=nums[i-1]){
        //         return false;
        //     }
        // }

        return true;
        
    }
}
