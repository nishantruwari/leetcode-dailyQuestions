class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
        
    }
}

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//method 2
class Solution {
    public String clearDigits(String s) {
        int j=-1;
        int n=s.length();
        StringBuilder str=new StringBuilder();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
                ++j;
                str.append(ch);
            }else{
                str.deleteCharAt(j);
                --j;

            }

        }

        return str.toString();
        
    }
}
