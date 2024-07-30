lass Solution {
    public int minimumDeletions(String s) {
        Stack<Character> stack =new Stack<>();
        int ans=0;
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty()&&stack.peek()=='b'&&s.charAt(i)=='a'){
                ++ans;
                stack.pop();
                

            }else
            stack.push(s.charAt(i));
        }
        return ans;
        
    }
}