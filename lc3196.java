class Solution {
    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings,(x,y)->Integer.compare(x[0],y[0]));

       // ArrayList<Integer> arr=new Arraylist<>();
        int daysUsed =0;

        int n=meetings.length;
        int l=meetings[0][0];
        int r=meetings[0][1];
        
        for(int i=1;i<n;i++){
            int lb=meetings[i][0];
            int ub=meetings[i][1];
            if(r>=lb){
                r=Math.max(r,ub);
            }else{
                daysUsed+=r-l+1;
                l=lb;
                r=ub;

            }


        }
        daysUsed+=r-l+1;
        return days-daysUsed;
        
    }
}
