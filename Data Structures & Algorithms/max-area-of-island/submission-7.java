class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[0].length; c++)
                if (grid[r][c] == 1){
                    int curr = dfs(grid, r, c);
                    res = Math.max(res, curr);
                }
        }
        return res;
    }

    private int dfs(int[][] grid, int r, int c){
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 1){
            return 0;
        }

        int k = 1;
        grid[r][c] = 0;
        
        k += dfs(grid, r - 1, c);
        k += dfs(grid, r + 1, c);
        k += dfs(grid, r, c - 1);
        k += dfs(grid, r, c + 1);

        return k;
    }
}
