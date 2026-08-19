class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        bt(res, new ArrayList<>(), 0, s);
        return res;
    }

    private void bt(List<List<String>> res, List<String> path, int start, String s){
        if (s.length() == start) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < s.length(); i++){
            if (isPalindrome(s, start, i)){
                path.add(s.substring(start, i + 1));
                bt(res, path, i + 1, s);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int l, int r){
        while (l < r){
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}
