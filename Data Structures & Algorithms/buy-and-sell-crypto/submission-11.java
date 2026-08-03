class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int l = 0;
        int r = l + 1;

        while (r < prices.length){
            if (prices[r] > prices[l]){
                int p = prices[r] - prices[l];
                res = Math.max(p, res);
            } else {
                l = r;
            }
            r++;
        }
        return res;
    }
}
