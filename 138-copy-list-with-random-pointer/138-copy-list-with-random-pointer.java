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
     
        //First add all element in HashMap Like <Node , Node>  so first             will be the curr and second will be new Node(curr.val)
        
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        
        for(Node curr =  head; curr !=  null ; curr =curr.next){
            map.put(curr, new Node(curr.val));
        }
        
        // create a new clone Node and attached element to it
        
        for(Node curr =  head ; curr!= null; curr = curr.next){
            Node clone =  map.get(curr);
            clone.next = map.get(curr.next);
            clone.random = map.get(curr.random);
        }
        
        Node head2 = map.get(head);
        
        return head2;
        
        
        
    }
}