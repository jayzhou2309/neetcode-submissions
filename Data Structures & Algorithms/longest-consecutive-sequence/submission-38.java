class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int x : nums){
            set.add(x);
        }

        int max = 0;

        for (int x : set){
            // smallest element;
            if (!set.contains(x - 1)){
                int curr = x;
                int length = 1;
                while (set.contains(curr + 1)){
                    length++;
                    curr++;
                }
                max = Math.max(max, length);
            }    
        }

        return max;
    }
}
