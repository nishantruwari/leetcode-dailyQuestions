class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr=new int[m][n];
        int count=0;
        int r=0;
        int c=0;
        if(m*n<original.length||m*n>original.length) return new int[0][0];
        for(int i=0;i<original.length;i++){
            arr[r][c]=original[i];
            c++;
            count++;
            if(count==n){
                count=0;
                c=0;
                r=r+1;

            }


        }
        return arr;
        
    }
}
