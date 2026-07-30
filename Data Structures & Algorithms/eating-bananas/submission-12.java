class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1; // in terms of hours
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r){
            // mid of hours
            int mid = (l + r) / 2;

            long totalTime = 0;
            for (int p : piles){
                // number of hours needed
                totalTime += Math.ceil((double) p / mid);
            }
            // totalHours < h hours
            if (totalTime <= h){
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
        
    }
}
