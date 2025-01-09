class Solution {
    public int prefixCount(String[] words, String pref) {
      //  int n=words.lenght;
        int count=0;

        for(String str: words){
            if(str.startsWith(pref)){
                ++count;
            }
        }
        return count;
        
    }
}
