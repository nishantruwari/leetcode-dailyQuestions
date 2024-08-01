class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(int i=0;i<details.length;i++){
            int c1=details[i].charAt(11)-'0';
            int c2=details[i].charAt(12)-'0';
          //  System.out.println(c1+" "+c2);
            int sum=c1*10+c2;
            if(sum>60) ++ans;
        }
        return ans;
        
    }
}