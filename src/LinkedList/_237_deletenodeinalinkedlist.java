package LinkedList;

public class _237_deletenodeinalinkedlist {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
