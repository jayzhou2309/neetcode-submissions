class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        // check for frequency
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char c : s1.toCharArray()){
            arr1[c - 'a']++;
        }

        int l = 0;
        for(int r = s1.length() - 1; r < s2.length(); r++){
            Arrays.fill(arr2, 0);
            String s = s2.substring(l, r + 1);
            for(char c : s.toCharArray()){
                arr2[c - 'a']++;
            }

            if(Arrays.equals(arr1, arr2)){
                return true;
            } else {
                l++;
            }
        }

        return false;
    }
}
