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
    int count = 0;
    public int maxDepth(TreeNode root) {
        int count1 = 0;
        int count2 = 0;
        if(root == null){
            return 0;
        }
        count1 = maxDepth(root.left);
        count1++;
        count2 = maxDepth(root.right);
        count2++;
        if(count1>count2){
            return count1;
        }
        return count2;
    }
}