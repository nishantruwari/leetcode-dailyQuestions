class Solution {
    public int findMaxFish(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        int ans=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    ans=Math.max(ans,dfs(grid,i,j,m,n));

                }
            }
        }

        return ans;
        
    }

    private int dfs(int[][] grid,int i,int j,int m,int n){
        if(i==m|| j==n|| i<0 || j<0|| grid[i][j]==0){
            return 0;
        }

        int val=grid[i][j];
        grid[i][j]=0;

        return val+dfs(grid,i+1,j,m,n)+dfs(grid,i,j+1,m,n)+dfs(grid,i-1,j,m,n)+dfs(grid,i,j-1,m,n);

    }
}
