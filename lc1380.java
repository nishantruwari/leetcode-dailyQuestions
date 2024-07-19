class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans=new LinkedList<>();
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            for(int j=0;j<matrix[0].length;j++){
                min=min>matrix[i][j]?matrix[i][j]:min;
                
            }
            s1.add(min);
        }
        for(int i=0;i<matrix[0].length;i++){
            int max=matrix[0][i];
            for(int j=0;j<matrix.length;j++){
                max=max<matrix[j][i]?matrix[j][i]:max;
                
            }
            if(s1.contains(max)){
                ans.add(max);
            }
        }
        // for(int i=0;i<s1.size();i++){
        //     if(s2.contains(s1.get(i))){
        //         ans.add(s1.get(i));
        //     }
        // }
        return ans;
        
    }
}