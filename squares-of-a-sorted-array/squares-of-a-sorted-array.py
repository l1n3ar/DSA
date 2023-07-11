class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)
        index = len(nums) - 1
        left = 0
        right = index
        while(index >= 0):
            if abs(nums[left]) > abs(nums[right]):
                res[index] = nums[left] ** 2
                index-=1
                left+=1
            else:
                res[index] = nums[right] ** 2
                right-=1
                index-=1
        
        return res
