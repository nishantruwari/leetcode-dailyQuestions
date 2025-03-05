class Solution {
    public long coloredCells(int n) {
        long ans=1;

        n=n-1;
        

        for(;n>0;n--){
            ans+=n<<2;
        }

        return ans;
        
    }
}
