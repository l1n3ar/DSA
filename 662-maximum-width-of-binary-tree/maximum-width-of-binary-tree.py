# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Pair : 

    def __init__(self,node,index):
        self.node = node
        self.index = index

class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:

        q = []

        if root is None : return 0

        q.append(Pair(node = root,index = 0))
        max_ = float("-inf")

        while(len(q) > 0):
            max_ = max(max_,q[-1].index - q[0].index + 1)
            for i in range(len(q)):    
                current = q.pop(0)

                if current.node.left : q.append(Pair(node = current.node.left,index = 2 * current.index))
                if current.node.right : q.append(Pair(node = current.node.right,index = (2 * current.index) + 1))
        
        return max_
            
        


