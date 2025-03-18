//trick currsum !=xorsum
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l=0,r=0,currsum=0,xorsum=0,count=0;
        xorsum=nums[r];
        currsum=nums[r];
        count=1;
        ++r;
        int maxcount=1;
        int n=nums.length;

        while(r<n){
            xorsum^=nums[r];
            currsum+=nums[r];
            ++count;
            while(currsum!=xorsum){
                currsum-=nums[l];
                xorsum^=nums[l];

                ++l;
                --count;
            }
            
            maxcount=Math.max(count,maxcount);
            ++r;


        }

        return maxcount;
        
    }
}
