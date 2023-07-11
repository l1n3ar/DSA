# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head is None or head.next is None : return True
        slow = fast = head
        while(fast and fast.next):
            fast = fast.next.next
            slow = slow.next
        new_head = self.reverse(slow)

        while(head and new_head):
            if head.val != new_head.val : return False
            head = head.next
            new_head = new_head.next
        
        return True
        
    def reverse(self,head : ListNode) -> ListNode:
        if head is None or head.next is None : return head
        prev = None

        while(head):
            next_node = head.next
            head.next = prev
            prev = head
            head = next_node
        return prev