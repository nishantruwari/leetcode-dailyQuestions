class Solution {
    public long maxKelements(int[] nums, int k) {
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
       
       for(int i: nums){
        pq.add(i);
       }
       long ans=0;
       for(int i=1;i<=k;i++){
        int max=pq.poll();
        ans+=max;
        pq.add((int)Math.ceil(max/3.0));
       }
       return ans;
        
    }
}
