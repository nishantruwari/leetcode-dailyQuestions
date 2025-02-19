class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> ans=new ArrayList<>();
        Queue<String> q=new LinkedList<>();

        q.offer("a");
        q.offer("b");
        q.offer("c");
        while(!q.isEmpty()){
            String curr=q.poll();
            if(curr.length()==n){
                ans.add(curr);
                continue;

            }
            String first;
            String second;
            char ch=curr.charAt(curr.length()-1);
            if(ch=='a'){
                first=curr+'b';
                second=curr+'c';

            }else{
                if(ch=='b'){
                    first=curr+'a';
                    second=curr+'c';

                }else{
                    first=curr+'a';
                    second=curr+'b';

                }
            }
           q.offer(first);
           q.offer(second);
        }

        if(ans.size()<k){
            return "";
        }

        return ans.get(k-1);
        
    }
}
