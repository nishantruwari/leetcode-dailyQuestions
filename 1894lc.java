class Solution {
    public int chalkReplacer(int[] chalk, int k) {
       long sum=0;
       for(int i:chalk){
        sum+=i;
       }
       long q=k/sum;
       //int rem=k%sum;
       long m=sum*q;
       long j=(long)k;
       j=j-m;
       k=(int)j;
       int i=0;
       int cond=1;
       while(cond==1){
        k=k-chalk[i];
        if(k<0) return i;
        i=(i+1)%chalk.length;


       }
       return i;
    }

}
