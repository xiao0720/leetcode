/**
 * Problem: #237 Delete Node in a Linked List
 *
 * Idea: no access to the node before
 *
 * Solutions:
 *  deleteNode: swap the node after to this node, and delete the next node.
 *
 * Note: #canbefaster
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
