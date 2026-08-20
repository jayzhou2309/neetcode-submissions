class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minP = prices[0];
        for (int i = 1; i < prices.length; i++){
            minP = Math.min(minP, prices[i]);
            int profit = prices[i] - minP;
            max = Math.max(max, profit);
        }

        return max;
    }
}
