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
    public ListNode sortList(ListNode head) {
       ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode curr =  head;
        while(curr != null){
            arr.add(curr.val);
            curr= curr.next ; 
        }
        ListNode temp = head;
        arr.sort(Comparator.naturalOrder());
        for(int i = 0; i < arr.size(); i++){
            temp.val = arr.get(i);
            temp= temp.next;
        }
        return head;
    }
}