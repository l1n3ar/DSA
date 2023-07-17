# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:

        res = []
        q = []

        if root is None : return res
        q.append(root)

        while(len(q) > 0):
            res.append(q[-1].val)
            for i in range(len(q)):
                current = q.pop(0)
                if current.left : q.append(current.left)
                if current.right : q.append(current.right)
        
        return res
