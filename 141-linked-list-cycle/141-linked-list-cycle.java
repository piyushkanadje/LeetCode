/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       
        if(head == null){
            return false;
        }
      
        
        HashSet<ListNode> list = new HashSet<ListNode> ();
        
        for(ListNode curr = head ; curr!=  null ; curr= curr.next){
            if(list.contains(curr)){
                return true;
            }else{
                list.add(curr);
            }
        }
        return false;
    }
}