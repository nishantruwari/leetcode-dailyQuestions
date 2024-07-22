class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        ArrayList<Integer> sorted =new ArrayList<>(map.keySet());
        Collections.sort(sorted);
        for(int i=0;i<heights.length;i++){
            names[i]=map.get(sorted.get(heights.length-1-i));

        }
        return names;
    }
}