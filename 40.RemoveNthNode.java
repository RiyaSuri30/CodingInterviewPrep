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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        // so the question here is to remove the Nth node from end of the linked list
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return null;
        }
        
        ListNode f = head;
        ListNode s = head;
        ListNode prev = null;
        int count =1;
            while(count <=n)
            {
                s = s.next;
                count++;
            }
        while(s!=null)
        {
            s=s.next;
            prev=f;
            f=f.next;
        }
      //  prev.next = f.next;
        
        if(f==head)
        {
            head= head.next;
        }
        else
        {
            prev.next = f.next;
        }
        return head;
    }
}
