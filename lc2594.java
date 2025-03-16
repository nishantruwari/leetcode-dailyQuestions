class Solution {
    public long repairCars(int[] ranks, int cars) {
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;

        for(int i: ranks){
            if(i<min){
                min=i;
            }

            if(i>max){
                max=i;
            }
        }

        max=max*cars*cars;
        long lb=min;
        long ub=max;
        long ans=-1;

        while(lb<=ub){
            long mid=lb+(ub-lb)/2;
            if(isPossible(mid,ranks,cars)){
                ans=mid;
                ub=mid-1;
            }else{
                lb=mid+1;
            }



        }


        return ans;

        
    }

    public boolean isPossible(long mid,int[] ranks,int cars){
        long carsRepaired=0;

        for(int rank:ranks){
            carsRepaired+=(long)(Math.sqrt(1.0*mid/rank));
            if(carsRepaired>=cars)  return true;
        }

        


        return false;
    }
}
