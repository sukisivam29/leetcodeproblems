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
    public int minDepth(TreeNode root) {
        int count1 = 0;
        int count2 = 0;
        if(root==null){
            return 0;
        }
        count1 = minDepth(root.left);
        count2 = minDepth(root.right);
        int min;
        if(count1==0){
            min = count2;
        }  
        else if(count2==0){
            min = count1;
        }
        else{
            min = Math.min(count1, count2);
        }
        return 1+min;
    }
}