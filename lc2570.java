class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[][] res=new int[m+n][2];

        int i=0,j=0;
        Arrays.sort(nums1,(x,y)->Integer.compare(x[0],y[0]));
        Arrays.sort(nums2,(x,y)->Integer.compare(x[0],y[0]));
        int k=0;
        for(;i<n && j<m ;){
            if(nums1[i][0]==nums2[j][0]){
                res[k][0]=nums1[i][0];
                res[k][1]=nums1[i][1]+nums2[j][1];
                ++k;
                ++i;++j;

            }else
            if(nums1[i][0]<nums2[j][0]){
                res[k][0]=nums1[i][0];
                res[k][1]=nums1[i][1];
                ++k;++i;

            }else{
                res[k][0]=nums2[j][0];
                res[k][1]=nums2[j][1];
                ++j;++k;

            }
        }
        while(j<m){
            res[k][0]=nums2[j][0];
                res[k][1]=nums2[j][1];
                ++j;++k;

        }
        while(i<n){
            res[k][0]=nums1[i][0];
                res[k][1]=nums1[i][1];
                ++k;++i;

        }

        return Arrays.copyOfRange(res,0,k);
    }
}
