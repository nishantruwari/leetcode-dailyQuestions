class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        ArrayList<Integer> sortedval = new ArrayList<>(map.values());
        Collections.sort(sortedval);
        ArrayList<Integer> sortedkeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedkeys);
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        // int[] ans=new int[nums.length];
        for (int i : sortedval) {
            for (int j = sortedkeys.size() - 1; j >= 0; j--) {
                if (map.get(sortedkeys.get(j)) == i) {

                    for (int k = 0; k < i; k++) {
                        ans.add(sortedkeys.get(j));
                    }
                    map.put(sortedkeys.get(j), 0);
                }
            }

        }
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;

    }
}