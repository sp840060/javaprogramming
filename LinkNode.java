package DivideAndConqure;
import java.util.*;
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
        this.val = 0;
        this.next = null;
    }

    public static void rearrange(ListNode head) {
        if (head == null || head.next == null) {
            return; 
        }

        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null; // Detach second half

        // Reverse the second half
        secondHalf = reverse(secondHalf);

        // Merge the first and reversed second halves iteratively
        ListNode curr = head;
        while (curr != null && secondHalf != null) {
            ListNode next = curr.next;
            curr.next = secondHalf;
            secondHalf = secondHalf.next;
            curr.next.next = next;
            curr = next;
        }
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
