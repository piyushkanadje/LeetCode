/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
   
        HashMap<Node, Node> hm = new HashMap<Node,Node>()   ;
    
        for(Node curr = head; curr!= null; curr = curr.next ){
                hm.put(curr , new Node(curr.val));
        }
        
        
        for(Node curr = head; curr != null; curr= curr.next){
            
            Node cloneCurr = hm.get(curr);
            cloneCurr.next = hm.get(curr.next);
            cloneCurr.random  = hm.get(curr.random);
            
        }

        
        Node head2=hm.get(head);
        
        return head2;
        
        
    }
}