class Solution {
    public int minChanges(String s) {

        int ans=0;
        for(int i=0;i<s.length();i+=2){
            //00
            //11

            if(s.charAt(i)!=s.charAt(i+1)){
                ans+=1;
            }
        }

        return ans;
        
    }
}
