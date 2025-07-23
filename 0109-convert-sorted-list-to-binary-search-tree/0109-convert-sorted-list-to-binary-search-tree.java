/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode root = insert(head, null);
        return root;
    }
    public static TreeNode insert(ListNode head, ListNode end){
        if(head==null||head==end){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=end&&fast.next!=end&&fast.next.next!=end){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.right=insert(slow.next, end);
        root.left=insert(head, slow);
        return root;
    }
}