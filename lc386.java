class Solution {
    public List<Integer> lexicalOrder(int n) {

        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            int curr=ans.getLast();
            if(curr*10<=n){
                curr*=10;
                ans.add(curr);
                continue;
            }

            while(curr%10==9 || curr+1>n){
                curr/=10;
            }
           
            ans.add(curr+1);
           
        }
         return ans;



        
    }
}
