class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        bt(nums, used, res, new ArrayList<>());
        return res;
    }

    private void bt(int[] nums, boolean[] used, List<List<Integer>> res, List<Integer> path){
        // have to use all elements;
        // hence size == len
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if (used[i]) continue;
            
            path.add(nums[i]);
            used[i] = true;
            bt(nums, used, res, path);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
