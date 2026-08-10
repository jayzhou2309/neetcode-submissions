class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            freq[e.getValue()].add(e.getKey());
        }

        int index = 0;
        int[] res = new int[k];

        for (int i = freq.length - 1; i > 0 && index < k; i--){

            for (int x : freq[i]){
                res[index] = x;
                index++;

                if (index == k) return res;
            }
        }

        return res;
    }
}
