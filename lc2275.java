class Solution {
    public int largestCombination(int[] candidates) {

        int max=0;
        for(int i=0;i<=24;i++){
            int setbits=0;

            for(int j:candidates){
               if (((j>>i)&1)==1){
                setbits+=1;
               }
            }
            max=Math.max(max,setbits);
        }

        return max;
        
    }
}
