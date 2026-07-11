class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int tp = 0;

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        for (char c : sc) {
            if (c != tc[tp]) return false;
            tp++;
        }

        return true;
    }
}
