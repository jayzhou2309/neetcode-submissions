class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            // make it into a char array
            int [] k = new int[26];
            for (char c : s.toCharArray()){
                // a = 1
                // 1 - 1 = 0
                k[c - 'a']++;
            }

            // 1010122
            String key = Arrays.toString(k);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
