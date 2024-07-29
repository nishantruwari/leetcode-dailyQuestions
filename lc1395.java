class Solution {
    public int numTeams(int[] rating) {
        int res=0;
        int n=rating.length;
        for(int j=1;j<n-1;j++){
            for(int i=0;i<j;i++){
                for(int k=j+1;k<n;k++){
                    if(rating[i]<rating[j]&&rating[j]<rating[k]){
                        ++res;
                    }else if(rating[i]>rating[j]&&rating[j]>rating[k]){
                        ++res;
                    }

                    
                }
            }
        }
        return res;
    }
}