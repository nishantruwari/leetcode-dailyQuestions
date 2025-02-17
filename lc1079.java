class Solution {
    public int numTilePossibilities(String tiles) {
        int[] count=new int[26];

        for(int i=0;i<tiles.length();i++){
            char ch=tiles.charAt(i);
            count[ch-'A']++;

        }

        return dfs(count);
        
    }

    private int dfs(int[] count){
        int sum=0;

        for(int i=0;i<count.length;i++){

            if(count[i]>0){
                sum++;
            count[i]--;
            sum+=dfs(count);
            count[i]++;

            }
            
        }

        return sum;
    }
}
