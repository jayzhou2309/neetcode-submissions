class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        // sort array
        Set<Integer> set = new HashSet<>();

        for(int x : nums){
            if (!(set.contains(x))){
                set.add(x);
            }
        }

        int[] arr = new int[set.size()];
        int index = 0;
        for(int x : set){
            arr[index] = x;
            index++;
        }
        Arrays.sort(arr);

        int curr = 1;
        int longest = 1;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] + 1 == arr[i+1]){
                curr++;
            } else {
                curr = 1;
            }
            longest = Math.max(longest, curr);
        }

        return longest;
    }
}
