class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // new data type
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            arr.add(new int [] {e.getValue(), e.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        // store result
        int [] res = new int [k];
        for (int i = 0; i < k; i++){
            res[i] = arr.get(i)[1];
        }

        return res;
    }
}
