class Solution {
    public int findMin(int[] nums) {
        // return min;
        return Arrays.stream(nums).min().getAsInt();

    }
}
