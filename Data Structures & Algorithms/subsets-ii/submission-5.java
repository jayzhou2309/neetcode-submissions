class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        bt(nums, 0, res, new ArrayList<>());
        return res;
    }

    private void bt(int[] nums, int start, List<List<Integer>> res, List<Integer> path){
        
        res.add(new ArrayList<>(path));

        for(int i = start; i < nums.length; i++){
            if (i > start && nums[i] == nums[i - 1]) continue;
            path.add(nums[i]);
            bt(nums, i + 1, res, path);
            path.remove(path.size() - 1);
        }
    }
}
