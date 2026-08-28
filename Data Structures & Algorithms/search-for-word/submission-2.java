class Solution {
    public boolean exist(char[][] arr, String word) {
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){
                if (bt(arr, word, r, c, 0)){
                    return true;
                }
            }
        }

        return false;

        
    }

    private boolean bt(char[][] arr, String word, int r, int c, int i){
        if (i == word.length()) return true;

        if (r < 0 || r >= arr.length || c < 0 || c >= arr[0].length || arr[r][c] != word.charAt(i)){
            return false;
        }

        char temp = arr[r][c];
        arr[r][c] = '#';

        boolean found = 
        bt(arr, word, r + 1, c, i + 1) || 
        bt(arr, word, r - 1, c, i + 1) ||
        bt(arr, word, r, c + 1, i + 1) ||
        bt(arr, word, r, c - 1, i + 1);

        arr[r][c] = temp;
        return found;

    }
}
