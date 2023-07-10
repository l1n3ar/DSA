class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums.sort()
        n = len(nums)
        current_min = nums[k-1] - nums[0]

        for i in range(k,n):
            current_min = min(current_min, nums[i] - nums[i-k+1])
        
        return current_min
        
