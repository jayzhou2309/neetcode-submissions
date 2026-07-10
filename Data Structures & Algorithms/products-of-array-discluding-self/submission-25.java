class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            int sum = 1;
            for (int j = 0; j < n; j++){
                if (i != j){
                    sum *= nums[j];
                }
            }
            res[i] = sum;
        }        
        return res;
    }
}  
