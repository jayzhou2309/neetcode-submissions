class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s: tokens){
            if (
                !s.equals("+") &&
                !s.equals("-") &&
                !s.equals("*") &&
                !s.equals("/") 
            ) {
                stack.push(Integer.parseInt(s));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int res = 0;
                if (s.equals("+")) res = a + b;
                else if (s.equals("-")) res = a - b;
                else if (s.equals("*")) res = a * b;
                else if (s.equals("/")) res = a / b;

                stack.push(res);
            }
        }

        return stack.pop();
    }
}
