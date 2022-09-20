# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode()
        curr = head
        count = 0
        while curr :
            count = count + 1
            curr = curr.next
        
        if count == 1 :
            return None;
        if count == n:
            head = head.next
            return head 
        
        curr = head
        
        count = count - n - 1
        while count > 0:
            count = count - 1
            curr = curr.next
            
            
        if curr.next :
            temp = curr.next
            curr.next = temp.next
        
        
        return head