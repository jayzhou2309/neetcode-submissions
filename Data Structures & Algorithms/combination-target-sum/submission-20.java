class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        bt(nums, target, res, new ArrayList<>(), 0);
        return res;
    }

    private void bt(int[] nums, int target, List<List<Integer>> res, List<Integer> path, int start){
        if (target == 0) {
            res.add(new ArrayList<>(path));
        }

        for (int i = start; i < nums.length; i++){
            if (nums[i] > target) continue;
            path.add(nums[i]);
            bt(nums, target - nums[i], res, path, i);
            path.remove(path.size() - 1);
        }


    }
}
