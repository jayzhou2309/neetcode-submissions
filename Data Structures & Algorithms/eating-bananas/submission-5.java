class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = Arrays.stream(piles).max().getAsInt(); 
        int l = 1;
        int res = r;

        while (l <= r){
            int m = l + (r - l) / 2;
            int totalTime = 0;
            for(int p : piles){
                totalTime += Math.ceil((double) p/m);
            }

            if (totalTime <= h){
                res = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return res;

        
    }
}
