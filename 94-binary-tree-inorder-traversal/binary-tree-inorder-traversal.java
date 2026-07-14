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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Inorder(ans,root);
        return ans;
    }
    public void Inorder(List<Integer> list , TreeNode root){
        if(root == null) return;
        Inorder(list,root.left);
        list.add(root.val);
        Inorder(list,root.right);
    }
}