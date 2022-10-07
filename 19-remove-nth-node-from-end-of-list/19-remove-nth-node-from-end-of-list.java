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
        int size = 0;
        while(temp != null){
            size++;
            temp= temp.next;
        }
        int removeIndex = size - n ;
        if(size == 0 &&  removeIndex == 0){
          head  = null;
        }
         
        if(removeIndex == 0){
            head = head.next;
        
        }else{
           temp = head;
            int index = 0;
            while(index < size-n-1){
                temp = temp.next;
                index ++;
            }
            temp.next = temp.next.next;
        }
     return head;   
       
    }
}