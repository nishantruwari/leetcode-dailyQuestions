class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            max = nums[i] > max ? nums[i] : max;
            min = nums[i] < min ? nums[i] : min;

        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            while (map.getOrDefault(i, 0) > 0) {
                nums[index] = i;
                index++;
                map.put(i, map.get(i) - 1);
            }
        }
        return nums;

    }
}