class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // recursive
        if (cleaned.length() <= 1) return true;

        if (cleaned.charAt(0) != cleaned.charAt(cleaned.length() - 1)) return false;

        return isPalindrome(cleaned.substring(1, cleaned.length() - 1));
    }
}
