class Solution {

    public boolean containsAll(int[] freq){
        // for(int i: freq){
        //     if(i==0){
        //         return false;
        //     }
        // }

        // return true;
        return freq[0]>0&& freq[1]>0 && freq[2]>0;
    }
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;
        int r=0,l=0;
        int[] freq=new int[3];


        while(r<n){
            char ch=s.charAt(r);
            freq[ch-'a']++;

            while(containsAll(freq)){
                count+=n-r;
                char lch=s.charAt(l);
                freq[lch-'a']--;
                ++l;


            }
            ++r;

           



        }

        return count;
        
    }
}
