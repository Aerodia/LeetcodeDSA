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
    int prev = -1;
    int min = Integer.MAX_VALUE;
    boolean first = true;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
    void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(!first){
            min = Math.min(min,root.val - prev);
        }
        prev = root.val;
        first = false;
        inorder(root.right);
    }
}