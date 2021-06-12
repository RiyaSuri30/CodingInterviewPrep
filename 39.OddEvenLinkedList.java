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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evener = head.next;
      
      while(even!=null && even.next!=null) // we dont set this to odd as odd is the fast moving pointer so it will terminate before all connections are set
      {
          odd.next = even.next; //toggling 
          odd=odd.next;
          even.next=odd.next;
          even=even.next;
      }
      // here also i we need to understand one thing 
     /* while(odd!=null && odd.next !=null)
      {
       odd.next= odd.next.next ;
       odd=odd.next;
      }
      */
      /* while(even!=null && even.next !=null)
      {
       even.next= even.next.next ;
       even=even.next;
      }
      this does not work for the following reasons as -> all odd connection are set first so we loose site of the even connections 
      */
        odd.next = evener;
        return head;
    }
}
