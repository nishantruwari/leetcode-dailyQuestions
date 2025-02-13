class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            
            pq.add((long)nums[i]);
        }
        int count=0;
        //if(pq.isEmpty()) return 0;
        

        while(pq.peek()<k && pq.size()>=2){
            ++count;
            long a=pq.poll();
            long b=pq.poll();
            long c=a*2+b;
            

            pq.add(c);
        }

        // if(pq.peek()<k){
        //     return -1;
        // }

        return count;
        
    }
}
