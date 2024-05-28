package leet_code_problems.Easy;

public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList rdsl = new RemoveDuplicatesFromSortedList();

        // Example 1
        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode result1 = rdsl.deleteDuplicates(head1);
        printList(result1);

        // Example 2
        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode result2 = rdsl.deleteDuplicates(head2);
        printList(result2);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)   return null;

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        System.gc();
        return head;
    }
}
