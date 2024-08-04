class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
    List<Integer> list=new ArrayList<>();
    long m=1000000007;
    for(int i =0;i<n;i++){
        long sum=0;
        for(int j=i;j<n;j++){
            sum=(sum%m+nums[j]%m)%m;
            list.add((int)sum);

        }
    }
  Collections.sort(list);
  long res=0;
  System.out.println(list);
  for(int i=left-1;i<right;i++){
    res=(res%m+list.get(i)%m)%m;
    //res=(res)%10^9;

  }
  return (int)res;

        
    }
}