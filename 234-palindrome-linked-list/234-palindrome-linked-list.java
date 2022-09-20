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
    public boolean isPalindrome(ListNode head) {
        int count = 0;
          ArrayList<Integer> arr = new ArrayList<Integer>();
        for(ListNode curr=  head; curr !=null; curr = curr.next){
           arr.add(curr.val); 
        }
        int arrS = arr.size();
        for(ListNode curr=  head; curr !=null; curr = curr.next){
           if(curr.val == arr.remove(arr.size() -1)){
              count++;
           }else{

           return false;
           }
        }
        if(count == arrS){
            return true;
        }
         return false;
    }
}