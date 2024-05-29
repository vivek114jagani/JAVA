package leet_code_problems.Easy;

// https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoSortedLists_21 mergeTwoSortedLists = new MergeTwoSortedLists_21();
        ListNode mergedList = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        printList(mergedList);
    }

    /**
     * Answer
     *     - Create the following variables
     *         - head, the sentinel head of the merged sorted list
     *         - tail, the sentinel tail of the merged sorted list
     *     - While 'l1' OR 'l2' is not equal to 'null'
     *         - If 'l2' is null OR 'l1' is not null AND 'l1.val' is less
     *           than 'l2.val'
     *             - Set 'tail.next' to 'l1'
     *             - Set 'tail' to 'l1'
     *             - Set 'l1' to 'l1.next'
     *         - Else
     *             - Set 'tail.next' to 'l2'
     *             - Set 'tail' to 'l2'
     *             - Set 'l2' to 'l2.next'
     *     - Return 'head.next'
     * */

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;

        while(list1 != null || list2 != null) {
            if(list2 == null || (list1 != null && list1.val < list2.val)) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }

        return head.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
