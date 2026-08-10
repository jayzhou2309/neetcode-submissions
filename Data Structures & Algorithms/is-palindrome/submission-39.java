class Solution {
    public boolean isPalindrome(String s) {
        // 2pointer

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0;
        int r = cleaned.length() - 1;
        while (l <= r){
            if (cleaned.charAt(l) != cleaned.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
