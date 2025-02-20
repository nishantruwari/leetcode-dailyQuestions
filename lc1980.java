class Solution {
    private void generate(StringBuilder str,int n,int i,List<String> list){
        if(i==n){
            list.add(str.toString());
            return ;
        }
        str.replace(i,i+1,"0");
        generate(str,n,i+1,list);
        str.replace(i,i+1,"1");
        generate(str,n,i+1,list);

    }
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder str=new StringBuilder();
        int n=nums.length;
        for(int i=0;i<n;i++){
            str.append("0");
        }
        List<String> list=new ArrayList<>();

        generate(str,n,0,list);

        for(String s: nums){
            list.remove(s);
        }
        return list.get(0);
        
    }
}
