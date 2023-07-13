# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        return self.solution(headA,headB)

    def getLength(self, head):
        length = 0
        while head:
            head = head.next
            length += 1
        return length
    
    # Faster than 96.35% (Yay!!)
    def solution(self, headA, headB):
        lenA = self.getLength(headA)
        lenB = self.getLength(headB)
        if lenB > lenA:
            headA, headB = headB, headA
            lenA, lenB = lenB, lenA
        
        
        diff = lenA - lenB
        while diff:
            headA = headA.next
            diff -= 1
        
        # print(headA.val, headB.val)
        
        while headA and headB and headA != headB:
            headA = headA.next
            headB = headB.next
        return headA
        
        return None


        

