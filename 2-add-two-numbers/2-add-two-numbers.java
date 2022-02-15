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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null) return null;
        if(l1 == null || l2 == null) return l1!=null ? l1 : l2;
        
        ListNode res = new ListNode();
        ListNode prev = res;
        
        int carry = 0;
        
        while(l1!=null || l2!=null){
            int x = l1!=null ? l1.val : 0;
            int y = l2!=null ? l2.val : 0;
            int total = x+y+carry;
            carry = total/10;
            ListNode node = new ListNode(total%10);
            res.next = node;
            res = res.next;
            
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        
        if(carry > 0) res.next = new ListNode(carry);
        
        return prev.next;
        
        
    }
}