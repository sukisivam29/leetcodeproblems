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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer>l= new ArrayList<>();
        ListNode l1=list1;
        ListNode l2= list2;
        while(l1!=null){
            l.add(l1.val);
            l1=l1.next;
        }
        List<Integer>n= new LinkedList<>();
        while(l2!=null){
            n.add(l2.val);
            l2=l2.next;
        }
        l.addAll(n);
        Collections.sort(l);
        ListNode d= new ListNode(0);
        ListNode temp =d;
        for(int i:l){
            temp.next= new ListNode(i);
            temp=temp.next;
        }
        return d.next;
    }
}