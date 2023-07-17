# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':

        path1,path2 = [],[]

        def lca(node,target,path):

            if node is None : return False

            path.append(node)
            if node.val == target.val : return True

            if lca(node.left,target,path) or lca(node.right,target,path) : return True

            path.pop()
            return False
        
        p1 = lca(root,p,path1)
        p2 = lca(root,q,path2)
        
        if not p1 or not p2:
            return None
        
        i = 0
        while (i < len(path1) and i < len(path2)):
            if path1[i] != path2[i]:
                break
            i+=1
        
        return path1[i-1]
        