class Solution {
    public int lenLongestFibSubseq(int[] arr) {

        Set<Integer> numset=new HashSet<>();
        for(int i:arr){
            numset.add(i);
        }
        int n=arr.length;
       // int i=0;
        int max=0;
        int curr=0;
        int prev;
        int len;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                prev=arr[j];
                curr=arr[i]+arr[j];
                len=2;
                while(numset.contains(curr)){
                    int temp=curr;
                    curr+=prev;
                    prev=temp;
                    max=Math.max(max,++len);
                }

            }
        }

        return max;        
    }
}
