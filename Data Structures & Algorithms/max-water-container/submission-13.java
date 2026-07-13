class Solution {
    public int maxArea(int[] heights) {
        // area

        int l = 0;
        int r = heights.length - 1;
        int largest = 0;

        while (l < r){
            int area = Math.min(heights[l], heights[r]) * (r - l);
            largest = Math.max(largest, area);
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }

        }
        return largest;
    }
}
