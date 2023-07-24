# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:
       current_sum = 0
       if not root : return root

       def reverse_inorder(node):
           nonlocal current_sum

           if not node : return

           reverse_inorder(node.right)

           current_sum+=node.val
           node.val = current_sum

           reverse_inorder(node.left)


       reverse_inorder(root) 



       return root
        