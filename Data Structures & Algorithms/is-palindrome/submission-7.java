class Solution {
    public boolean isPalindrome(String s) {
        String x = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int head = 0;
        int tail = x.length() - 1;

        while (head < tail){
            if(x.charAt(head) != x.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }

        return true;
    }
}
