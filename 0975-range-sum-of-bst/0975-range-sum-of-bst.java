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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root, low, high);
        return sum;
    }
    public void inorder(TreeNode root, int low, int high){
        if(root == null){
            return;
        }
        inorder(root.left, low, high);
        if(root.val >= low && root.val <=high){
            sum = sum + root.val;
        }
        inorder(root.right, low, high);
    }
}