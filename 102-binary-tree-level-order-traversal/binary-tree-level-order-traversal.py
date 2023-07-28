# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        if root is None : return []
        res = []
        q = deque()

        q.append(root)

        while q:
            current_level = []
            size = len(q)

            for _ in range(size):

                current = q.popleft()
                current_level.append(current.val)

                if current.left : q.append(current.left)
                if current.right : q.append(current.right)


            res.append(current_level)


        return res        