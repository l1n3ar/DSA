# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:

        if root is None : return []
        res = []

        def traverse(node,res,current):

            if node is None : return

            current+=str(node.val)+"->"

            if not node.left and not node.right:
                res.append(current[:len(current)-2])
            
            if node.left : traverse(node.left,res,current)
            if node.right : traverse(node.right,res,current)

        traverse(root,res,"")
        return res
