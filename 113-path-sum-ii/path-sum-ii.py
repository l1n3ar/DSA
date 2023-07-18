# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        res = []
        if not root : return None

        def dfs(node,current,current_sum,target,res):

            if not node : return None

            current_sum+=node.val
            current.append(node.val)

            if not node.left and not node.right:
                if current_sum == target:
                    res.append(current[:])

            if node.left : dfs(node.left,current,current_sum,target,res)
            if node.right : dfs(node.right,current,current_sum,target,res)

            current_sum-=node.val
            current.pop()
        
        dfs(root,[],0,targetSum,res)


        return res