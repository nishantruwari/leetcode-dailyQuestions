class Solution {
    public int minimumLength(String s) {

        int n=s.length();
        int count=0;
       

        //or we could used arr here of 26
        int[] arr=new int[26];

        for(int i=0;i<n;i++){
             char ch=s.charAt(i);
            arr[ch-'a']++;
            if(arr[ch-'a']==3){
               // count++;
                arr[ch-'a']=1;
            }
            

        }

        for(int i=0;i<26;i++){
            count+=arr[i];
        }


        // int count=0;
         //HashMap<Character,Integer> map=new HashMap<>();

        // for(int i=0;i<n;i++){
        //     char ch=s.charAt(i);

            
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        //     if( map.get(ch)==3){
        //        map.put(ch,1);
        //     }
        // }
        
      
        // for(int i:map.values()){
        //    count+=i;
        // }
        return count;
    }
}
