# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:

        # find sum of tree
        # do inorder
        #keep track of current sum
        # total sum + current key - current sum
        
        def sum(node):

            if not node : return 0

            return node.val + sum(node.left) + sum(node.right)

        
        total_sum = sum(root)
        current_sum = 0

        def inorder(node):
            nonlocal current_sum
            nonlocal total_sum

            if not node : return

            inorder(node.left)
            current_sum+=node.val
            node.val = (total_sum + node.val) - current_sum
            inorder(node.right)
        

        inorder(root)

        return root