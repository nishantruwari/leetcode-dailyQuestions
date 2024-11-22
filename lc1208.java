//bruteforce way --> checking if rows are exactly same or exactly opposite 
class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int max=0;
        for(int i=0;i<n-1;i++){
            int count=1;

            for(int j=i+1;j<n;j++){
                int r=0;
                int c=0;
                for(int k=0;k<m;k++){
                    if(matrix[i][k]==matrix[j][k]){
                        ++r;
                    }else{
                        ++c;
                    }
                }
                if(r==m || c==m){
                    ++count;
                }
            }
            max=Math.max(count,max);

        }

        return max;
        
    }
}
