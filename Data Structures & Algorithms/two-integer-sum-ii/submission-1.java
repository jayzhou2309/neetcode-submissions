class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while(l <= r){
            int sum = arr[l] + arr[r];
            if (sum < target){
                l++;
            } else if (sum > target){
                r--;
            } else {
                return new int [] {l + 1, r + 1};
            }
        }

        return new int[] {};
    }
}
