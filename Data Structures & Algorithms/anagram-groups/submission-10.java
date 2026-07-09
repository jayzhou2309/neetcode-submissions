class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String sS = new String(ca);
            map.putIfAbsent(sS, new ArrayList<>());
            map.get(sS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
