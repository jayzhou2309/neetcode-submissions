class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];
        bt(nums, res, new ArrayList<>(), seen);
        return res;
    }

    private void bt(int[] nums, List<List<Integer>> res, List<Integer> path, boolean[] seen){
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }


        for (int i = 0; i < nums.length; i++){
            if (seen[i]) continue;

            seen[i] = true;
            path.add(nums[i]);

            bt(nums, res, path, seen);
            seen[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
