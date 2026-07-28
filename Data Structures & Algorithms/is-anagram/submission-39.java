class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sc = s.toCharArray();
        Arrays.sort(sc);
        char [] tc = t.toCharArray();
        Arrays.sort(tc);

        for (int i = 0; i < sc.length; i++){
            if(sc.length != tc.length) return false;
            if(sc[i] != tc[i]){
                return false;
            }
        }
        return true;
    }
}
