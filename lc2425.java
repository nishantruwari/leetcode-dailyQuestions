class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n =nums1.length;
        int m=nums2.length;

        //case 1 even ^even
        if(m%2==0&& n%2==0) return 0;

        //case 2 even ^ odd

        if(n%2==0 && m%2!=0)  {
            int xor=0;
            for(int i:nums1){
                xor^=i;
            }

            return xor;
        }

        //case3 odd odd
        if(n%2!=0 && m%2!=0){
            int xor=0;
            for(int i:nums1){
                xor^=i;
             }
             for(int i:nums2){
                xor^=i;
             }
              return xor;
        }

        //case 4 odd even
        int xor=0;
        for(int i:nums2){
            
           
                xor^=i;
            
           
        }
         return xor;
        
       
    }
}
