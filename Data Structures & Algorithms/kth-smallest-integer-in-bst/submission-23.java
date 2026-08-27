/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        int x = 0;
        for (int i = 0; i < k; i++){
            x = res.get(i);
        }
        return x;
    }
    private void dfs(TreeNode root, List<Integer> res){
        if (root == null) return;
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }
}
