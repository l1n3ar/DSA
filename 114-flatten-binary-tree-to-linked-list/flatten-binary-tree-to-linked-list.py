# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def flatten(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """

        res = []

        def dfs(node):
           nonlocal res

           if node is None : return

           res.append(node)
           if node.left : dfs(node.left)
           if node.right : dfs(node.right)
        

        dfs(root)

        for i in range(len(res) - 1):
            res[i].left = None
            res[i].right = res[i+1]


        



           
