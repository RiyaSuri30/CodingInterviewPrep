class Solution
{
   
    public static int count(Node head, int search_for)
    {
        //code here
        int counter = 0;
        if(head==null)
        {
            return 0;
        }
        while(head!=null)
        {
        if(head.data == search_for)
        {
            counter++;
            
        }
        head = head.next;
        }
        return counter;
    }
    
}
// https://practice.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1/?track=ppc-linkedlist&batchId=221#
