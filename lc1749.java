class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n =nums.length;
        int maxpos=Integer.MIN_VALUE;
        int maxneg=Integer.MAX_VALUE;
        int currsumpos=0;
        int currsumneg=0;

        for(int i=0;i<n;i++){
            if(currsumpos<0){
                currsumpos=0;
            }
            currsumpos+=nums[i];
            maxpos=Math.max(maxpos,currsumpos);

            if(currsumneg>0){
                currsumneg=0;
            }
            currsumneg+=nums[i];
            maxneg=Math.min(maxneg,currsumneg);

        }
        if(maxneg==Integer.MAX_VALUE){
            return maxpos;
        }

        return Math.max(maxpos,Math.abs(maxneg));
        
    }
}
