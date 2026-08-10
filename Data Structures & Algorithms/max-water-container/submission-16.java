class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int res = 0;

        while (l < r){
            int area = Math.min(arr[l], arr[r]) * (r - l);

            if (arr[r] > arr[l]){
                l++;
            } else {
                r--;
            }

            res = Math.max(res, area);
        }

        return res;
    }
}
