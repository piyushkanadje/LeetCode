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
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, ListNode> map = new HashMap<ListNode, ListNode> ();
        
        for(ListNode curr =  head; curr != null; curr = curr.next){
            if(map.containsKey(curr.next)){
                return curr.next;
            }else{
                map.put(curr, curr.next);
            }
        }
        return null;
    }
}
