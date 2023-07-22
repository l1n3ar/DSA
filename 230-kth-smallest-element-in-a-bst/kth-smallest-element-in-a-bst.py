# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:

        if not root : return 0
        count = 0
        kth = 0

        def dfs(node):
            nonlocal count
            nonlocal kth


            if not node : return

            if node.left : dfs(node.left)
            
            count+=1
            if count == k :
                kth = node.val
                return 
            if node.right : dfs(node.right)

        
        
        dfs(root)
        return kth



        # inorder traversal
        # start counting at the left most node
        # when k value is the number of calls return the node