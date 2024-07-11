class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        int[] ch=new int[26];
        for(int i=0;i<l1;i++){
            ++ch[s1.charAt(i)-'a'];

        }
        for(int i=0;i<l2;i++){
            --ch[s2.charAt(i)-'a'];
            if(i-l1>=0){
                ++ch[s2.charAt(i-l1)-'a'];
            }
            if(checkAllZero(ch)) return true;
        }
        return false;
        
    }

    public boolean checkAllZero(int[] ch){
        for(int i:ch){
            if(i!=0){
                return false;
            }
            
        }
        return true;
    }
}