class Solution {
    public boolean isPrefixAndSuffix(String str1,String str2){

        
        // int m=str1.length();
        // int n=str2.length();
        // if(m>n){
        //     return false;
        // }
        // if(!str2.substring(0,m).contains(str1)) return false;

        // if(!str2.substring(n-m,n).contains(str1)) return false;

        // return true;
        return str2.startsWith(str1) && str2.endsWith(str1);


    }
    public int countPrefixSuffixPairs(String[] words) {
        

        int count =0;
       // Arrays.sort(words,(a,b)->a.length()-b.length());

        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    ++count;
                }
            }
        }   

        return count;    
    }
}
