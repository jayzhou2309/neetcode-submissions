class Solution {
    public int maxArea(int[] heights) {
        int l = 1;
        int r = heights.length;
        int res = 0;
        while (l < r){
            int area = Math.min(heights[r - 1], heights[l - 1]) * (r - l);
            res = Math.max(res, area);

            if (heights[l - 1] < heights[r - 1]){
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
