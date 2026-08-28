class Solution {
    public int numIslands(char[][] arr) {
        // intuition is: dfs thoru, mark as seen
        int k = 0;
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){
                if (arr[r][c] == '1'){
                    k++;
                    helper(arr, r, c);
                }
            }
        }

        return k;

    }

    private void helper(char[][] arr, int r, int c){
        if (r < 0 || r >= arr.length || c < 0 || c >= arr[0].length || arr[r][c] != '1'){
            return;
        }

        arr[r][c] = '0';

        helper(arr, r - 1, c);
        helper(arr, r + 1, c);
        helper(arr, r, c - 1);
        helper(arr, r, c + 1);

    }
}
