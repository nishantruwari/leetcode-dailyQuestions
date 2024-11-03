class Solution {
    public boolean rotateString(String s, String goal) {

        int a=s.length();
        int b=goal.length();
        if(a!=b){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }

        for(int i=1;i<a;i++ ){
            int j;
            for( j=0;j<a;j++){
                if(s.charAt(j)!=goal.charAt((i+j)%a)){
                    break;
                }
            }

            if(j==a){
                return true;
            }
        }

        return false;
        
    }
}
