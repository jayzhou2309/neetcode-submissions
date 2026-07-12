class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            int[] k = new int[26];
            for (char c : s.toCharArray()){
                // k[1], k[2]
                k[c - 'a']++;
            }
            String key = Arrays.toString(k);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
        
    }
}
