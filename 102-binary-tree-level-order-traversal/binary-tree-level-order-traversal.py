# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        q = []
        res = []

        if root is None : return root

        q.append(root)

        while(len(q) > 0):
            current_level = []
            for i in range(len(q)):
                current = q.pop(0)
                current_level.append(current.val)
                if current.left : q.append(current.left)
                if current.right : q.append(current.right)


            res.append(current_level)
        
        return res