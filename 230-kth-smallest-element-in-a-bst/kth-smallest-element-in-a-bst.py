class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        def dfs(node):
            nonlocal k
            if not node:
                return None
            
            left_result = dfs(node.left)
            if left_result is not None:
                return left_result
            
            k -= 1
            if k == 0:
                return node.val
            
            return dfs(node.right)
        
        return dfs(root)
