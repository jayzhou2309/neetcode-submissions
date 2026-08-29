class Solution {
    public int numIslands(char[][] arr) {
        int k = 0;
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){
                if (arr[r][c] == '1'){
                    k++;
                    dfs(arr, r, c);
                }
            }
        }

        return k;
    }

    private void dfs(char[][] arr, int r, int c){
        if (r < 0 || r >= arr.length || c < 0 || c >= arr[0].length || arr[r][c] != '1'){
            return;
        }

        arr[r][c] = '0';

        dfs(arr, r - 1, c);
        dfs(arr, r + 1, c);
        dfs(arr, r, c - 1);
        dfs(arr, r, c + 1);
    }
}
