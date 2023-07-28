# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:

        if root is None : return []
        res = []

        q = deque()
        q.append(root)

        while q:
            current_sum = 0
            current_number = len(q)
            for _ in range(current_number):

                current = q.popleft()
                current_sum+=current.val

                if current.left : q.append(current.left)
                if current.right : q.append(current.right)
            
            res.append(current_sum / current_number)
        

        return res
