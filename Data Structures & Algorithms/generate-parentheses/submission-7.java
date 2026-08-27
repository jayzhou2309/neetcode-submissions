class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        bt(n, "", res, 0, 0);
        return res;
    }

    private void bt(int n, String path, List<String> res, int open, int close){
        if (path.length() == n*2){
            res.add(path);
            return;
        }
        if (open < n){
            bt(n, path + '(', res, open + 1, close);
        }

        if (close < open){
            bt(n, path + ')', res, open, close + 1);
        }
    }
}
