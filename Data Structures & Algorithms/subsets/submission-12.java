class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, res, new ArrayList<>(), 0);
        return res;
    }

    private void dfs(int[] nums, List<List<Integer>> res, List<Integer> path, int start){
        res.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++){
            path.add(nums[i]);
            dfs(nums, res, path, i + 1);;
            path.remove(path.size() - 1);
        }
    }
}
