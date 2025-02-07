class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> colors=new HashMap<>();

        int n=queries.length;
        int total=0;
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            int ball=queries[i][0];
            int color=queries[i][1];

            if(map.containsKey(ball)){
                //reduce color of that ball by 1 becz it might happen that multiple ball of same color might be there 
                int ballPrevColor=map.get(ball);
                colors.put(ballPrevColor,colors.get(ballPrevColor)-1);
                if(colors.get(ballPrevColor)==0){
                    --total;
                }
                
            }

            map.put(ball,color);
            
            colors.put(color,colors.getOrDefault(color,0)+1);
            if(colors.get(color)==1){
                ++total;
            }

            ans[i]=total;

        }

        return ans;

        
    }
}
