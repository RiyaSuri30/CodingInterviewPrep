// https://leetcode.com/problems/palindrome-linked-list/
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
class Solution 
{
    public boolean isPalindrome(ListNode head)
    {
        
        //here we need to have the two pointer approach
     
        
        //finding middle of the linked list
        
        //so to find the middle of th e
        ListNode sp = head;
        ListNode fp = head;
        ListNode mid = null;
        
        // so the way we 
        while(fp!=null && fp.next!=null)
        {
            sp = sp.next;
            fp= fp.next.next;
        }
        
        //if odd number of nodes are there
        if(fp!=null)
        {
         mid = sp.next;   
        }
        else
        {
         mid = sp;
        }
        
       //now we need to reverse linked list
        
        ListNode prev= null, next = null;
        while(mid!=null)
        {
            next = mid.next;
            mid.next = prev;
            prev=mid;
            mid= next;
        }
        
        
        // now we need to traverse
        // prev would be the start of the linked list 
        while(prev!=null)
        {
        if(prev.val != head.val)
        {
            return false;
        }
        else
        {
            prev= prev.next;
            head = head.next;
        }
        }
        return true;
        
        
        
        
    }
}
