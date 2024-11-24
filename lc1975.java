class Solution {
    public long maxMatrixSum(int[][] matrix) {

        int m=matrix.length;
        int n=matrix[0].length;
        int countneg=0;
        int maxneg=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        long sum=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(matrix[i][j]<0){
                    ++countneg;
                    maxneg=Math.max(matrix[i][j],maxneg);
                    sum+=-1*matrix[i][j];
                }else{
                    sum+=matrix[i][j];
                    min=Math.min(matrix[i][j],min);
                }
            }
        }

        if(countneg%2!=0){

            if(min<-1*maxneg){
                sum=sum-2*min;

            }else{
                sum=sum+2*maxneg;

            }
            
        }

        return sum;
        
    }
}
