class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        int max = 0;

        while (l < r){
            int area = Math.min(arr[l], arr[r]) * (r - l);

            if (arr[l] < arr[r]){
                l++;
            } else if (arr[r] < arr[l]){
                r--;
            } else {
                l++;
                r--;
            }

            max = Math.max(area, max);
        }

        return max;
    }
}
