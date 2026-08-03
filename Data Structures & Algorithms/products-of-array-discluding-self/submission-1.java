class Solution {
    public int[] productExceptSelf(int[] nums) {
        // pref suff
        int n = nums.length;
        int [] pref = new int[n];
        pref[0] = nums[0];

        for (int i = 1; i < n; i++){
            pref[i] = pref[i - 1] * nums[i];
        }

        int[] suff = new int[n];
        suff[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suff[i] = suff[i + 1] * nums[i];
        }

        // combine
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            int left = (i==0) ? 1 : pref[i - 1];
            int right = (i==n - 1) ? 1 : suff[i + 1];
            res[i] = left * right;
        }
        return res;
    }
}  
