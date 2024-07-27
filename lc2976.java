class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int n=26;
        int[][] graph=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    graph[i][j]=0;
                }else{
                    graph[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        //filling values
        for(int i=0;i<original.length;i++){
            int u=original[i]-'a';
            int v=changed[i]-'a';
            graph[u][v]=graph[u][v]>cost[i]?cost[i]:graph[u][v];
        }

        // applying floydd warshall algorithm
        ///hint got to i--> j via k ::: i-->k + k-->j
        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    if(graph[i][k]!=Integer.MAX_VALUE&& graph[k][j]!=Integer.MAX_VALUE){
                        if(graph[i][j]>graph[i][k]+graph[k][j]){
                            graph[i][j]=graph[i][k]+graph[k][j];
                        }
                    }

                }
            }
        }

       long ans=0;
        for(int i=0;i<source.length();i++){
            int u=source.charAt(i)-'a';
            int v=target.charAt(i)-'a';
            if(graph[u][v]==Integer.MAX_VALUE) return -1;
            ans+=graph[u][v];
        }
        return ans;

        
    }
}