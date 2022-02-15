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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null) return null;
        if(l1 == null || l2 == null) return l1!=null ? l1 : l2;
        
        
        ListNode current1 = l1;
        ListNode current2 = l2;
        
        
        ListNode head = null;
        ListNode current = head;
      
        
        
        while(current1!=null && current2!=null){
            if(current1.val <= current2.val){
                if(head == null){
                    head = current = current1;
                    current1 = current1.next;
                }else{
                    current.next = current1;
                    current1 = current1.next;
                     current = current.next;
                }
            }else{
                if(head == null){
                    head = current = current2;
                    current2 = current2.next;
                }else{
                    current.next = current2;
                    current2 = current2.next;
                    current = current.next;
                }
            }
           
        }
        
        while(current1!=null){
            current.next = current1;
            current = current.next;
            current1 = current1.next;
        }
        
          
        while(current2!=null){
            current.next = current2;
            current = current.next;
            current2 = current2.next;
        }
        
        return head;
    }
}