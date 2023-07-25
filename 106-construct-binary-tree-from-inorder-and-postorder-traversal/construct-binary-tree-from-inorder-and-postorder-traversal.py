# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:



        index = len(postorder) - 1

        def build(po,io,isi,iei):
            nonlocal index
            idx = 0

            if isi > iei : return None

            node = TreeNode(val = po[index])
            index-=1

            if isi == iei : return node

            for i in range(isi,iei+1):
                if io[i] == node.val:
                    idx = i
                    break

            node.right = build(po,io,idx+1,iei)
            node.left = build(po,io,isi,idx - 1)
         

            return node
        


        return build(postorder,inorder,0,len(postorder) - 1)