class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        bt(nums, target, 0, res, new ArrayList<>());
        return res;
    }

    // base pattern
    private void bt(int[] nums, int target, int start, List<List<Integer>> res, List<Integer> path){
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < nums.length; i++){
            if (nums[i] > target) continue;

            path.add(nums[i]);
            bt(nums, target - nums[i], i, res, path);
            path.remove(path.size() - 1);
        }
    }
}
