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
    public boolean isValidBST(TreeNode root) {
        
        return helper(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long l, long r){
        if (root == null) return true;

        if (!(l < root.val && root.val < r)) return false;

        return helper(root.left, l, root.val) && helper(root.right, root.val, r);
    }


}
