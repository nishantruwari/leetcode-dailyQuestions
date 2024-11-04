class Solution {
    public String compressedString(String word) {
        StringBuilder str=new StringBuilder();
        int n=word.length();
        int count=0;

        for(int i=0;i<n;){
            char ch=word.charAt(i);
            count=0;

            while(i<n&&word.charAt(i)==ch){
                ++count;
                if(count==9){
                    str.append("9");
                    str.append(ch);
                    count=0;
                   // continue;
                }
                ++i;

            }

            //count=0;
            if(count>0){
                str.append(count);
            str.append(ch);

            }
            


        }

        return str.toString();
        
    }
}
