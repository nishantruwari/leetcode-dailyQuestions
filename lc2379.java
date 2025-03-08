class Solution {
    public int minimumRecolors(String blocks, int k) {
        int black=0;
        int white=0;
        int min=0;
        int n=blocks.length();
        if(k>n) return -1;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                ++white;
            }else{
                ++black;
            }

        }

        min=white;
        int p=0;
        for(int i=k;i<n;i++){
            if(blocks.charAt(p)=='W'){
                --white;
            }else{
                --black;
            }
            ++p;
            if(blocks.charAt(i)=='W'){
                ++white;
            }else{
                ++black;
            }

            min=Math.min(min,white);


        }


        return min;
        
    }
}
