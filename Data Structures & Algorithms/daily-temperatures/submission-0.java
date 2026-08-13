class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                int prev = st.pop();
                res[prev] = i - prev;
            }
            st.push(i);
        }

        return res;
    }
}
