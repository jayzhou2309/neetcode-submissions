class Solution {
    public void solve(char[][] arr) {
        for (int r = 0; r < arr.length; r++){
            dfs(arr, r, 0);
            dfs(arr, r, arr[0].length - 1);
        }
        for (int c = 0; c < arr[0].length; c++){
            dfs(arr, 0, c);
            dfs(arr, arr.length - 1, c);
        }

        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){
                if (arr[r][c] == 'O'){
                    arr[r][c] = 'X';
                }

                if (arr[r][c] == 'S'){
                    arr[r][c] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] arr, int r, int c){
        if (r < 0 || r >= arr.length || c < 0 || 
        c >= arr[0].length || arr[r][c] != 'O') return;

        arr[r][c] = 'S';

        dfs(arr, r - 1, c);
        dfs(arr, r + 1, c);
        dfs(arr, r, c - 1);
        dfs(arr, r, c + 1);
    }
}
