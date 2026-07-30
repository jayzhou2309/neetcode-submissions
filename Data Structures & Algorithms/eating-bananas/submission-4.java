class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r){
            // 3
            int k = (l + r) / 2;

            long totalTime = 0;
            for(int x : piles){
                // adds in the most amount of time needed to
                // eat the bananas
                totalTime += Math.ceil((double) x / k);
            }
            if (totalTime <= h){
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return res;
    }
}
