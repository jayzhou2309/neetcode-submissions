class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        bt(n, 0, 0, res, "");
        return res;
    }

    private void bt(int n, int open, int close, List<String> res, String path){
        if (path.length() == n*2) res.add(path);

        if (open < n){
            bt(n, open + 1, close, res, path + "(");
        }

        if (close < open){
            bt(n, open, close + 1, res, path + ")");
        }
    }
}
