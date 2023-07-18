# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        if root is None : return []

        res = []
        q = []
        level = 0

       

        q.append(root)

        while(len(q) > 0):
            
            current_level = []

            for _ in range(len(q)):
                current = q.pop(0)
                current_level.append(current.val)
                if current.left : q.append(current.left)
                if current.right : q.append(current.right)

            if level % 2 != 0:
                res.append(current_level[::-1])
            else:
                res.append(current_level)
            
            level+=1
        

        return res


            

