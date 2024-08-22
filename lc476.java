class Solution {
    public int findComplement(int num) {
        StringBuilder str=new StringBuilder();
         StringBuilder comp=new StringBuilder();
        int a=-1;
        while(num>0)
        {
            a=num%2;
            num=num/2;
            str.append(a);
        } 
        str.reverse();
        System.out.println(str);   
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                comp.append("0");
            }else{
                comp.append("1");
            }
        } 
        System.out.println(comp);
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++){
            int pow=(int)Math.pow(2,n-1-i);
            System.out.println(pow);
            System.out.println(comp.charAt(i)-'0');
            res+=pow*(comp.charAt(i)-'0');

        }
       
        return res;
    }
}
