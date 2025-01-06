class Solution {
    public int[] minOperations(String boxes) {

        // bruteforce

        int n = boxes.length();
        int ans[] = new int[n];

        int aux[] = new int[n];
         int onecount=0;

        //aux[0] = 0;
         if(boxes.charAt(0)=='1'){
            onecount=1;
        }else
         onecount=0;
       
        for (int i = 1; i < n; i++) {
           if(aux[i-1]==0){
            aux[i]=boxes.charAt(i-1)-'0';
           }else{
            aux[i]=onecount+aux[i-1];
           }

           if(boxes.charAt(i)=='1'){
            onecount++;
           }

        }
       
        int auxx[] = new int[n];
        auxx[n - 1] = 0;
        if(boxes.charAt(n-1)=='1'){
            onecount=1;
        }else
         onecount=0;

        for (int i = n-2; i >=0; i--) {
           if(auxx[i+1]==0){
            auxx[i]=boxes.charAt(i+1)-'0';
           }else{
            auxx[i]=onecount+auxx[i+1];
           }

           if(boxes.charAt(i)=='1'){
            onecount++;
           }

        }
        

        for (int i = 0; i < n; i++) {
            ans[i] = aux[i] + auxx[i];
          
        }

        return ans;
    }
}
