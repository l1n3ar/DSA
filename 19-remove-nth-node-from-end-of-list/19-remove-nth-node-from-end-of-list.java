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
        
        if(head == null || head.next == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        int i = 0;
        while(i < n){
            fast = fast.next;
           if(fast == null) return head.next;
           i++;
        }
        
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return head;
    
    }
}