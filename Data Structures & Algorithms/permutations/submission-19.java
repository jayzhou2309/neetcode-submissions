class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        bt(nums, used, res, new ArrayList<>());
        return res;
    }

    public void bt(int[] nums, boolean[] used, List<List<Integer>> res, List<Integer> path){
        if (path.size() == nums.length) res.add(new ArrayList<>(path));
        

        for (int i = 0; i < nums.length; i++){
            if (used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            bt(nums, used, res, path);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
