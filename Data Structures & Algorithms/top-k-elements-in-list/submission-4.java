class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // put into HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Create array to be sorted by values
        List<int[]> arr = new ArrayList<>();
        // map.entry 
        // each entry contains the KV
        // entryset returns the K and V
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            // new [[],[],[]]
            arr.add(new int[] {e.getValue(), e.getKey()});
        }
        arr.sort((a,b) -> b[0] - a[0]);

        // after sorting
        int[] res  = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = arr.get(i)[1];
        }

        return res;
        
    }
}
