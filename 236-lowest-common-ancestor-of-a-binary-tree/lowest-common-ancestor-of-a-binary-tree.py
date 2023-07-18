# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':

        lca_ = None

        if root is None : return root
        
        def lca(node):

            nonlocal lca_

            if node is None : return False

            if node.val == p.val or node.val == q.val:
                lca_ = node
                return True

            left = lca(node.left)
            right = lca(node.right)

            if left and right : 
                lca_ = node
                return True
                
            return left or right
            
            


        lca(root)
        return lca_
        
