# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:

        p_index = len(postorder) - 1
        mp = {}

        for i,v in enumerate(inorder):

            mp[v] = i
        

        def build(p,i,isi,iei):
            nonlocal p_index

            if isi > iei : return None

            node =  TreeNode(val = p[p_index])
            p_index-=1

            if isi == iei : return node

            i_index = mp[node.val]

            node.right = build(p,i,i_index + 1,iei)
            node.left = build(p,i,isi,i_index - 1)
            

            return node






        return build(postorder,inorder,0,len(postorder) - 1)
        