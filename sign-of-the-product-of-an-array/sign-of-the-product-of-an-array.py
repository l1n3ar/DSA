class Solution:
    def arraySign(self, nums: List[int]) -> int:
        product = 1
        for num in nums:
            if num == 0:
                return 0
            elif num < 0:
                product*=-1
        
        return product