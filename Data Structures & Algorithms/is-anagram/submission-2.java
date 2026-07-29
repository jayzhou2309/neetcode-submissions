class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] s1 = new int[26];
        int[] s2 = new int[26];

        for (int i = 0; i < s.length(); i++){
            s1[s.charAt(i) - 'a']++;
            s2[t.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1, s2)) return true;

        return false;
    }
}
