class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int res = 0;

        while (r < prices.length){
            if (prices[l] < prices[r]){
                int p = prices[r] - prices[l];
                res = Math.max(res, p);
            } else {
                l = r;
            }
            r++;
        }
        return res;
    }
}
