class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sum_ = (n * (n+1) // 2)

        return sum_ - sum(nums)