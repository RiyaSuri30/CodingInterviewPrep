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
    public ListNode middleNode(ListNode head) {
        // so how do we the middle of the linked list.
        
        // we want slow to
        ListNode slow = head;
        ListNode fast = head;
        // so both the pointers point at head
        // and then we move slow pointer by next and fast by next.next
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast=fast.next.next;
        }
        // finally we return slow pointer and that gives us the middle of the linked list 
        return slow;
    }
}

// https://leetcode.com/problems/middle-of-the-linked-list/
