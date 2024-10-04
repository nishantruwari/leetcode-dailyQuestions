class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        long ans=0;
        long sum=skill[0]+skill[n-1];
        int temp=0;
        ans=ans+skill[0]*skill[n-1];
        for(int i=1,j=n-2;i<j;i++,j--){
            temp=skill[i]+skill[j];
            if(temp!=sum){
                return -1;

            }
            ans=ans+skill[i]*skill[j];
            


        }
        return ans;
        
    }
}
