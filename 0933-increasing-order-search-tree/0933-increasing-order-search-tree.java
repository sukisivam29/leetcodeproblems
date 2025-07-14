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
    TreeNode current;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode t = new TreeNode(0);
        current = t;
        inorder(root);
        return t.right;
    }
    public TreeNode inorder(TreeNode root){
        if(root == null){
            return null;
        }
        inorder(root.left);
        root.left = null;
        current.right = root;
        current = current.right;
        inorder(root.right);
        return root;
    }
}