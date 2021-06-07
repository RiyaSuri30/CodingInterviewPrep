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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        // so i guess the way we can work for this is as follows
        ListNode pseudohead = new ListNode(-1);
        ListNode curr = pseudohead;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                ListNode node = new ListNode(l1.val);
                curr.next=node;
                curr=curr.next;
                l1=l1.next;
            }
            else 
            {
                ListNode node = new ListNode(l2.val);
                curr.next=node;
                curr=curr.next;
                l2=l2.next;
            }
            
        }
        
        while(l1!=null)
        {
            ListNode node = new ListNode(l1.val);
                curr.next=node;
                curr=curr.next;
                l1=l1.next;
        }
        while(l2!=null)
        {
            ListNode node = new ListNode(l2.val);
                curr.next=node;
                curr=curr.next;
                l2=l2.next;
        }
        return pseudohead.next;
    }
}
