class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();

        int n=s.length();
        int j=0;
        int m=spaces.length;
        for(int i=0;i<n;i++){
            if(j<m&&i==spaces[j]){
                j++;
               
                str.append(" ");
                
                
            }
            str.append(s.charAt(i));

        }

        return str.toString();
        
    }
}
