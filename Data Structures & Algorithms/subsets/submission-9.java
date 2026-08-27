class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(nums, new ArrayList<>(), res, 0);
        return res;
    }

    private void bt(int[] nums, List<Integer> path, List<List<Integer>> res, int start){

        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++){
            path.add(nums[i]);
            bt(nums, path, res, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
