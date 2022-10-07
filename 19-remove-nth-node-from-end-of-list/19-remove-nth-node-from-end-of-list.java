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
       ListNode temp=head;
        
        //calculate size of the linked list
        int size = 0;
        while(temp != null){
            size++;
            temp= temp.next;
        }
        
    //calculate remove Index which index do you want to remove
        int removeIndex = size - n ;
        
       // check weather size is 0 retur null
        if(size == 0 &&  removeIndex == 0){
          head  = null;
        }
    
        
        // Check that we have size more than 2 and remove index 0 then make head = head.next;
         
        if(removeIndex == 0){
            head = head.next;
        
        }
//other wise iterate  through linked list until size-n-1 
        
        else{
           temp = head;
            int index = 0;
            while(index < size-n-1){
                temp = temp.next;
                index ++;
            }
            
          //   and after iterating through linked list you will get out of while loop at 3 ( 1-> 2->3->4->5) and make 3.next = 3.next.next
            temp.next = temp.next.next;
        }
     return head;   
       
    }
}