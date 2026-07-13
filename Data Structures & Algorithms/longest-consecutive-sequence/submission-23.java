class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }

        int longest = 0;

        for (int x : set){
            if (!set.contains(x - 1)){
                int length = 1;
                while(set.contains(x + length)){
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
