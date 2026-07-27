class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0;
        int r = cleaned.length() -1;

        while(l < r){
            if(cleaned.charAt(l) == cleaned.charAt(r)){
                l++;
                r--;
            } else {
                return false;
            }
        }    
        return true;
        
    }
}
