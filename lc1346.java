class Solution {
    public boolean checkIfExist(int[] arr) {
        //int[] ans=new int[501];

        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]==2*arr[j] || arr[j]==2*arr[i]){
                    return true;
                }

            }

        }
        return false;
        
    }
}
