class Solution {
     public ListNode modifiedList(int[] nums, ListNode head) {
        // Convert nums into a HashSet for fast lookups
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        // Dummy node before the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {
            if (set.contains(current.next.val)) {
                // Skip the node to remove it
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return dummy.next; // Return new head
    }
}