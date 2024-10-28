class Solution {
    public int longestSquareStreak(int[] nums) {

        int max=-1;
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums){

            int root=(int)Math.sqrt(i);

            if(root*root==i && map.containsKey(root)){
                map.put(i,map.get(root)+1);
                max=Math.max(max,map.get(i));


            }else{
                map.put(i,1);
            }

        }

        return max;
        
    }
}
