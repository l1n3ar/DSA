class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        left_sum,right_sum = 0,sum(nums)
        for idx,num in enumerate(nums):
            left_sum+=num
            if left_sum == right_sum:
                return idx
            right_sum-=num
        return -1
      

