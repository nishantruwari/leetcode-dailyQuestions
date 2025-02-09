class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        int[] diff=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=nums[i]-i;
        }
        long count=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int prevcount=0;
            if(map.containsKey(diff[i])){
                 prevcount=map.get(diff[i]);

            }
            
            count+=i-(prevcount);
            map.put(diff[i],map.getOrDefault(diff[i],0)+1);
            
        }

        return count;
        
    }
}
