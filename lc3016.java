class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
       ;
        int n=map.size();
        if(n<=8){
            return word.length();
        }
      
        int arr[]=new int[n];
        int j=0;
        for(int i: map.values()){
            arr[j]=i;
            ++j;
          


        }
        Arrays.sort(arr);
        int ans=0;
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(count<8){
                ans+=arr[i];
            }else if(count<16){
                ans+=arr[i]*2;
            }else if(count<24){
                ans+=arr[i]*3;
            }else{
                ans+=arr[i]*4;
            }
            ++count;

        }
        return ans;
        
    }
}