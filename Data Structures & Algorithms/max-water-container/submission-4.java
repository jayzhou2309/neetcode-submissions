class Solution {
    public int maxArea(int[] arr) {
        int l = 1;
        int r = arr.length;
        int res = 0;

        while (l < r){
            int area = Math.min(arr[l - 1], arr[r - 1]) * (r - l);
            res = Math.max(res, area);
            if (arr[l - 1] > arr[r - 1]){
                r--;
            } else {
                l++;
            }
        }
        return res;
    }
}
