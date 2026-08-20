class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s : strs){
            res.append(s.length()).append('#').append(s); 
        }

        return res.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();

        int i = 0;

        while (i < s.length()){
            int j = i; // 0;

            while (s.charAt(j) != '#'){
                j++; // charAt 1;
            }

            int length = Integer.parseInt(s.substring(i, j));

            int start = j + 1;

            res.add(s.substring(start, length + start));

            i = start + length;
        }

        return res;
    }
}
