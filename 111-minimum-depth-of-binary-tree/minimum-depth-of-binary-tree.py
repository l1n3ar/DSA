# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

from collections import deque
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:

        if not root : return 0

        q = deque()
        q.append(root)

        depth = 0
        
        while q:
            size = len(q)
            depth+=1
            for _ in range(size):

                current = q.popleft()

                if not current.left and not current.right : return depth

                if current.left : q.append(current.left)
                if current.right : q.append(current.right)





        return depth
        