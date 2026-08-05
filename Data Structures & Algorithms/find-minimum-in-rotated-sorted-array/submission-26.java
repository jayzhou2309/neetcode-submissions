class Solution {
    public int findMin(int[] nums) {
        int halfway = 0;
        int l = 0;
        int r = nums.length - 1;

        // bound
        while (l < r) {
            int m = l + (r - l) / 2;

            if (nums[r] < nums[m]){
                l = m + 1;;
            } else {
                r = m;
            }
        }

        return nums[l];
    }
}
