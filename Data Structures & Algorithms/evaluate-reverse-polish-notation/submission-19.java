class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        
        for(int i = 0; i < tokens.length; i++){
            if (
                !tokens[i].equals("+")  &&
                !tokens[i].equals("-")  &&
                !tokens[i].equals("*")  &&
                !tokens[i].equals("/") 
            ){
                st.push(Integer.parseInt(tokens[i]));
            } else {
                int b = st.pop();
                int a = st.pop();

                int result = 0;

                if (tokens[i].equals("+")){
                    result = a + b;
                } else if (tokens[i].equals("-")){
                    result = a - b;
                } else if (tokens[i].equals("*")){
                    result = a * b;
                } else if (tokens[i].equals("/")){
                    result = a / b;
                }

                st.push(result);
            }

        }
        return st.pop();
    }
}
