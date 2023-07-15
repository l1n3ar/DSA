# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self.traverse(root,res)
        return res
    
    def traverse(self,node,res):

        if node is None : return
        self.traverse(node.left,res)
        res.append(node.val)
        self.traverse(node.right,res)