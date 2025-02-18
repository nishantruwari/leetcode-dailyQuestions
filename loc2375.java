class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        StringBuilder str=new StringBuilder();
        for(int i=1;i<=n+1;i++){
            str.append(i);
        }
        int j=0;
        int prev=0;

        for(int i=0;i<n-1;i++){
            if((pattern.charAt(i)=='I'&&pattern.charAt(i+1)=='I')||(pattern.charAt(i)=='D'&&pattern.charAt(i+1)=='D')){
                ++j;
                continue;
            }
            if((pattern.charAt(i)=='I'&&pattern.charAt(i+1)=='D')){
                prev=i+1;
                ++j;

            }else{
                ++j;
                String sub=str.substring(prev,j+1);
                String rev=new StringBuilder(sub).reverse().toString();
                str.replace(prev,j+1,rev);
            }
        }

        if(pattern.charAt(n-1)=='D'){
            String sub=str.substring(prev,n+1);
                String rev=new StringBuilder(sub).reverse().toString();
                str.replace(prev,n+1,rev);

        }

        return str.toString();
        
    }
}
