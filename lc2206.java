class Solution {
    public boolean divideArray(int[] nums) {
       // int n=nums.length;
        // HashMap<Integer,Integer>  map=new HashMap<>();

        // for(int num: nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }


        // for(int value: map.values()){
        //     if(value%2!=0){
        //         return false;
        //     }
        // }


        // return true;
//============================================================
        //second solution

        int[] arr=new int[501];

        for(int i: nums){
            arr[i]++;
        }


        for(int i: arr){
            if(i%2!=0){
                return false;
            }
        }

        return true;

    }
}
