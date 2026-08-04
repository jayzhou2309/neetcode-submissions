class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int l = 0;
        int[] freq = new int[26];
        int[] s2f = new int[26];
        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }

        for (int r = 0; r < s2.length(); r++){
            s2f[s2.charAt(r) - 'a']++;
            if ((r - l + 1) > s1.length()){
                s2f[s2.charAt(l) - 'a']--;
                l++;
            }
            if (Arrays.equals(freq, s2f)) return true;
        }

        return false;

    
    }
}
