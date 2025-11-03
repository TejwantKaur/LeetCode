class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();

        for(int n:nums)
            hs.add(n);

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode curr = temp;
        while(curr.next!=null){
            if(hs.contains(curr.next.val))
                curr.next=curr.next.next;
            else
                curr = curr.next;
        }

        return temp.next; 
    }
}