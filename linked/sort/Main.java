class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {

    // --------------- MERGE SORT ---------------
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;

        // Step 1: get mid
        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;  // break list

        // Step 2: sort left + right
        ListNode leftSorted = mergeSort(head);
        ListNode rightSorted = mergeSort(right);

        // Step 3: merge sorted halves
        return merge(leftSorted, rightSorted);
    }

    // --------------- FIND MID ---------------
    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head.next;  
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // --------------- MERGE TWO SORTED LISTS ---------------
    private ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    // --------------- MAIN (TESTING) ---------------
    public static void main(String[] args) {
        // Unsorted list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        Main obj = new Main();
        ListNode sorted = obj.mergeSort(head);

        System.out.print("Sorted List: ");
        while (sorted != null) {
            System.out.print(sorted.val + " ");
            sorted = sorted.next;
        }
    }
}
