# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:

        res = float("-inf")

        def dfs(node):
            nonlocal res
            if not node : return -1

            left = dfs(node.left)
            right = dfs(node.right)

            res = max(res,left + right + 2)

            return 1 + max(left,right)
        

        dfs(root)
        return res
        