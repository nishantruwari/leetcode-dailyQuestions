class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        for(int i: target){
            int flag=0;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    flag=1;
                    arr[j]=-1;
                    break;

                }
            }
            if(flag==0){
                return false;
            }
        }
        return true;
        
    }
}