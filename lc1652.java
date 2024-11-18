class Solution {
    public int[] decrypt(int[] code, int k) {

        int n=code.length;
        int[] codex=new int[n];

        if(k==0){
            for(int i=0;i<n;i++){
                codex[i]=0;
            }
        }else if(k>0){
            for(int i=0;i<n;i++){
               int count=1;
                int sum=0;
                for(int j=(i+1)%n;count<=k;j=(j+1)%n,count++){
                    sum+=code[j];
                }
                codex[i]=sum;
            }
        }else{
            k=-1*k;
            for(int i=0;i<n;i++){
                int count=1;
                int sum=0;
                for(int j=(i-1+n)%n;count<=k;j=(j-1+n)%n,count++){
                    sum+=code[j];
                }
                codex[i]=sum;
            }

        }

        return codex;
        
    }
}
