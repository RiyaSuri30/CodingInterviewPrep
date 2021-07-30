class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        // 1->2->3->4->5
        //    prev sp    fp
        // 
        
        Node prev = null;
        Node sp = head;
        Node fp = head;
        while(fp!=null && fp.next!=null)
        {
            prev = sp;
            sp = sp.next;
            fp = fp.next.next;
        }
        prev.next = sp.next;
        return head;
    }
}
// delete Middle of linked list
