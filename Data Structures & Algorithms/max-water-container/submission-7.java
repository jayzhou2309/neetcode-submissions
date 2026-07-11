class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int total = 0;

        while(l < r){

            int area = Math.min(heights[l], heights[r]) * (r - l);
            total = Math.max(total, area);

            if (heights[l] >= heights[r]){
                r--;
            } else {
                l++;
            }
        }

        return total;
        
    }
}
