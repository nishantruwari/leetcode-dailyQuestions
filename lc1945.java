class Solution {
    public int cal(int sum,int k){
      if(k==0){
        return sum;
      }
       int ans=0;
        
            while(sum>0){
                int temp=sum%10;
            ans+=temp;
            sum/=10;
            }
            

        
        return cal(ans,k-1); 
    }
    public int getLucky(String s, int k) {
        int sum=0;
        String str="";

        for(int i=0;i<s.length();i++){
            int j=s.charAt(i)-'a'+1;
           // System.out.println(j);
            str+=j;

        }
         System.out.println(str);
         for(int i=0;i<str.length();i++){
            int j=str.charAt(i)-'0';
            System.out.println(j);
            sum+=j;

        }

        return cal(sum,k-1);
        
    }
}
