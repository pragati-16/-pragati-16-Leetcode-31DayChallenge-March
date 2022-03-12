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
        HashMap<Node, Node> mp = new HashMap<>();
        Node trav = head;
        while(trav != null){
            Node temp = new Node(trav.val);
            mp.put(trav, temp);
            trav = trav.next;
        }
        trav = head;
        while(trav != null){
            Node temp = mp.get(trav);
            temp.next = mp.get(trav.next);
            temp.random = mp.get(trav.random);
            trav = trav.next;
        }
        return mp.get(head);
    }
}
