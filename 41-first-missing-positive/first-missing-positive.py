class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:

        s = set(nums)
        res = 0
        for i in range(1, 2**31 - 1):
            if i not in s:
                res = i
                break
        
        return res
        