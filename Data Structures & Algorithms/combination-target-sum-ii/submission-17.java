class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        bt(arr, target, 0, res, new ArrayList<>());
        return res;
    }

    private void bt(int[] arr, int target, int start, List<List<Integer>> res, List<Integer> path){
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < arr.length; i++){
            if (i > start && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            path.add(arr[i]);
            bt(arr, target - arr[i], i + 1, res, path);
            path.remove(path.size() - 1);
        }
    }
}
