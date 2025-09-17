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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        
        // [1,2] if to remove n=2, i.e head
        if(n==size) return head.next;
        
        int prev = size-n;
        temp = head;

        for(int i=1; i<prev; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}