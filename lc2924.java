class Solution {
    public int findChampion(int n, int[][] edges) {
       // int n=edges.length;
        int[] arr=new int[n];
        

        for(int[] i: edges){
            
            arr[i[1]]++;
            
        }
        int ele=-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                ++count;
                ele=i;
                if(count>1){
                    return -1;
                }
            }
        }

        return ele;
        
    }
}
