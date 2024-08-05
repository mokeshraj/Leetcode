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
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to handle the edge case where head needs to be removed
    ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy; // Start from the dummy node

        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                // Skip the node with the target value
                curr.next = curr.next.next;
            } else {
                // Move to the next node
                curr = curr.next;
            }
        }

        // Return the new head, which is dummy.next
        return dummy.next;
    }
}