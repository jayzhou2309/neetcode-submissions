class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums1){
            set.add(x);
        }

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums2.length; i++){
            if (set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }

        int[] res = new int[result.size()];
        int i = 0;
        for (int x : result){
            res[i] = x;
            i++;
        }

        return res;
    }
}