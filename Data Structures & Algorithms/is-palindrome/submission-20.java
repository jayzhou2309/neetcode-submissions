class Solution {
    public boolean isPalindrome(String s) {
        String sort = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int head = 0;
        int tail = sort.length() - 1;
        while (head < tail) {
            if (sort.charAt(head) != sort.charAt(tail)) return false;
            head++;
            tail--;
        }
        return true;
    }
}
