class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int i : nums){
            int x = target - i;
            if(map.containsKey(x)){
                return new int [] {map.get(x), index};
            }
            map.put(i, index);
            index++;
        }

        return new int [] {};
    }
}
