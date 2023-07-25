# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:

        p_idx = 0
        mp = {}

        for i,v in enumerate(inorder):
            mp[v] = i

        def build(po,io,isi,iei):

            nonlocal p_idx

            if isi > iei : return None

            node = TreeNode(val = po[p_idx])
            p_idx+=1

            if iei == isi : return node
            
            idx = mp[node.val]

            node.left = build(po,io,isi,idx - 1)
            node.right = build(po,io,idx + 1,iei)

            return node



        


        return build(preorder,inorder,0,len(inorder) - 1)
        