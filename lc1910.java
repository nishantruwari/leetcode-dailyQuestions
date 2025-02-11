class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str=new StringBuilder(s);
        int n=part.length();

        while(str.indexOf(part)!=-1){
            int index=str.indexOf(part);
            str.delete(index,index+n);

        }

        return str.toString();
        
    }
}
