class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        if(n<3){
            return s;
        }
        StringBuilder str=new StringBuilder();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int count =0;
            while(i<n &&s.charAt(i)==ch ){
                ++count;
                ++i;
            }
            if(count==1){
                str.append(ch);
            }else{
                str.append(ch);
                str.append(ch);
            }
            --i;
        }
        return str.toString();

        
    }
}
