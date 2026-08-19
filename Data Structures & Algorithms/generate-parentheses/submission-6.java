class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        bt(res, "", n, 0, 0);
        return res;
    }

    private void bt(List<String> res, String s, int n, int open, int close){
        if (s.length() == n*2){
            res.add(s);
            return;
        }

        if (open < n){
            bt(res, s + '(', n, open + 1, close);
        }

        if (close < open){
            bt(res, s + ')', n, open, close + 1);
        }
    }
}
