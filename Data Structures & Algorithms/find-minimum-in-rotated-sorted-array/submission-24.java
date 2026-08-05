class Solution {
    public int findMin(int[] nums) {
        // half
        // rotate front
        int l = 0;
        int r = nums.length - 1;
        int res = Integer.MAX_VALUE;
        while (l <= r ){
            int curr = Math.min(nums[l], nums[r]);
            res = Math.min(res, curr);
            l++;
            r--;
        }

        return res;
    }
}
