class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length + 1];

        for (int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < list.length; i++){
            list[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            list[e.getValue()].add(e.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = nums.length; i > 0 && index < k; i--){
            for (int n : list[i]){
                res[index] = n;
                index++;
            }
            if (index == k){
                return res;
            }
        }

        return res;
    }
}
