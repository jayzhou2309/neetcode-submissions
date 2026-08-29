class Solution {
    public int maxAreaOfIsland(int[][] arr) {
        int res = 0;
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){
                if (arr[r][c] == 1){
                    res = Math.max(res, dfs(arr, r, c));
                }
            }
        }
        return res;
    }

    private int dfs(int[][] arr, int r, int c){
        if (r < 0 || r >= arr.length || c < 0 || c >= arr[0].length || arr[r][c] != 1){
            return 0;
        }

        arr[r][c] = 0;
        int area = 1;

        area += dfs(arr, r - 1, c);
        area += dfs(arr, r + 1, c);
        area += dfs(arr, r, c - 1);
        area += dfs(arr, r, c + 1);

        return area;
    }
}
