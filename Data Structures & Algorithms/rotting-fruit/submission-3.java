class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int mins = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[0].length; c++){
                if (grid[r][c] == 2){
                    q.offer(new int[] {r, c});
                } else if (grid[r][c] == 1){
                    fresh++;
                }
            }
        }

        int[][] dirs = {
            {1, 0},{0, 1},
            {-1, 0},{0, -1}
        };

        while (!q.isEmpty() && fresh > 0){
            int size = q.size();
            for (int i = 0; i < size; i++){
                int curr[] = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] d : dirs){
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr < 0 || nr >= grid.length ||
                        nc < 0 || nc >= grid[0].length ||
                        grid[nr][nc] != 1){
                            continue;
                    }
                    grid[nr][nc] = 2;;
                    fresh--;
                    q.offer(new int[]{nr, nc});
                }
            }
            mins++;
        }
        return fresh == 0 ? mins : -1;
    }
}
