class Solution {
    public String ans(String s){
        Stack<Character> stack=new Stack<>();
        Queue<Character> temp=new LinkedList<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            while(s.charAt(i)!=')'){
                stack.push(s.charAt(i));
                i++;
            }
            while(stack.peek()!='('||stack.empty()){
                temp.add(stack.pop());
            }
            if(stack.peek()=='(')
            stack.pop();// for removing (
            while(!temp.isEmpty()){
                stack.push(temp.remove());
            }


        }

        while(!(stack.empty())){
            
            str.append(stack.pop());
        }
        return str.toString();

    }
    public String reverseParentheses(String s) {
        StringBuilder in=new StringBuilder("("+s+")");
        return ans(in.toString());
        
        
    }
}