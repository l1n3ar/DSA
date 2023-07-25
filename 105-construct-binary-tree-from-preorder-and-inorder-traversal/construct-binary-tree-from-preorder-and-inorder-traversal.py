# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:

        index = 0

        def build(pre,io,isi,iei):

            nonlocal index

            if isi > iei : return None

            node = TreeNode(val = pre[index])
            index+=1

            if isi == iei : return node

            for i in range(isi,iei+1):
                if io[i] == node.val:
                    idx = i
                    break
            
            node.left = build(pre,io,isi,idx - 1)
            node.right = build(pre,io,idx+1,iei)


            return node
        


        return build(preorder,inorder,0,len(inorder) - 1)