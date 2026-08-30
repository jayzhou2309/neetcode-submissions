class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[0].length; c++){
                if (grid[r][c] == 0){
                    q.offer(new int[] {r, c});
                }
            }
        }

        int[][] dirs = {
            {1, 0},{0, 1},
            {-1, 0},{0, -1}
        };

        while (!q.isEmpty()){
            int curr[] = q.poll();
            int r = curr[0];
            int c = curr[1];

            for (int[] d  : dirs){
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= grid.length ||
                    nc < 0 || nc >= grid[0].length ||
                    grid[nr][nc] != Integer.MAX_VALUE){
                        continue;
                    }
                grid[nr][nc] = grid[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
    }
}
