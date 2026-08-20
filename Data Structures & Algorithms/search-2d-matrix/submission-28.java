class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int ROWS = arr.length;
        int COLS = arr[0].length;

        int l = 0;
        int r = COLS * ROWS - 1;

        while (l <= r){
            int mid = l + (r - l) / 2;
            int row = mid / COLS;
            int col = mid % COLS;

            if (arr[row][col] > target){
                r = mid - 1;
            } else if (arr[row][col] < target){
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
