class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        bt(nums, target, 0, res, new ArrayList<>());
        return res;
    }

    private void bt(int[] nums, int target, int start, List<List<Integer>> res, List<Integer> path){
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length; i++){
            if (i > start && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            path.add(nums[i]);
            bt(nums, target - nums[i], i + 1, res, path);
            path.remove(path.size() -1);
        }
    }
}
