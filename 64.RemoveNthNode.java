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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        int count = 1;
        while(count<=n)
        {
            fast = fast.next;
            count++;
        }
        
        while(fast!=null)
        {
            prev= slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(slow==head)
        {
            head = head.next;
        }
        // then what we can do is as follows
        else
        {
            prev.next = slow.next;
        }
        return head;
    }
}
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
