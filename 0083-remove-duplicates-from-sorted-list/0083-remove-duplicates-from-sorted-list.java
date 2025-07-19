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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer>h= new LinkedHashSet<>();
        ListNode c=head;
        while(c!=null){
            h.add(c.val);
            c=c.next;
        }
        ListNode dummy= new ListNode(0);
        ListNode t=dummy;
        for(int m:h){
            t.next= new ListNode(m);
            t=t.next;
        }
        return dummy.next;
    }
}