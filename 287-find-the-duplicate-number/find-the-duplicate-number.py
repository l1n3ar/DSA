class Solution:
    def findDuplicate(self, nums: List[int]) -> int:

        ans = [False] * (len(nums) + 1)
        res = 0

        for i in nums:
            if ans[i] : 
                res = i
                break
            ans[i] = True
        
        return res