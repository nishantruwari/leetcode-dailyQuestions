class Solution {
    public long minimumSteps(String s) {

        long count=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)-'0'==0){
                count+=j-i;
                i++;
            }
        }
        return count;
        
    }
}
