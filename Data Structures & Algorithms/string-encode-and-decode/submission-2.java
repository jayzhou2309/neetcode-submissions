class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs){
            res.append(s.length()).append('#').append(s);
        }

        return res.toString();

        // 4#neet4#code
        
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()){
            int j = i;

            while (s.charAt(j) != '#'){
                j++; // j = 1;
            }
            
            // 1st char;
            int length = Integer.parseInt(s.substring(i, j));

            int start = j + 1; // charAt(2);

            res.add(s.substring(start, start + length)); // get first word;

            i = start + length; // 2 + 4
        }

        return res;
  
    }
}
