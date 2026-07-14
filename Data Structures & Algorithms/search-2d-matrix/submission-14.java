class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int ROWS = arr.length;
        int COLS = arr[0].length;

        int l = 0;
        int r = ROWS*COLS - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int row = m / COLS;
            int col = m % COLS;

            if (arr[row][col] < target) {
                l = m + 1;
            } else if (arr[row][col] > target){
                r = m - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
