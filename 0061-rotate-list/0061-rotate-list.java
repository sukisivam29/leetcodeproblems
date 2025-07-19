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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0) return head;
        ArrayList<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        int n = values.size();
        k = k % n;
        if (k == 0) return head;
         if (k > 0) {
            Collections.rotate(values, k);
        } 
        
ListNode newHead = null;
ListNode tail = null;

for (int val : values) {
    ListNode node = new ListNode(val);
    if (newHead == null) {
        newHead = node; // First node becomes the head
        tail = node;    // Tail also starts here
    } else {
        tail.next = node; // Append to the end
        tail = node;      // Move tail forward
    }
}

        return newHead;
    }
}