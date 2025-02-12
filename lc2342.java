class Solution {
    public int sum(int n){ // calculates sum of digits
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        //hashmap would have sum of digits and elements having that sum of digits sorted in descending order
        //

        int n=nums.length;
        int max=-1;

        for(int i=0;i<n;i++){
            int sumOfDigits=sum(nums[i]);
// if map contains tht sum of digits it would see the first element of the queue (which is max ) and add nums to it 
// then compare this sum with max present already 
            if(map.containsKey(sumOfDigits)){
            
                max=Math.max(map.get(sumOfDigits).peek()+nums[i],max);
                map.get(sumOfDigits).add(nums[i]);
            }else{
                PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
                pq.add(nums[i]);
                map.put(sumOfDigits,pq);
            }
        }

        return max;
        
    }
}
