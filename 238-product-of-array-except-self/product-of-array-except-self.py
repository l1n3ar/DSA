class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        pre = [1] * len(nums)
        curr = 1

        for i in range(len(nums)):
            pre[i] = curr
            curr = curr*nums[i]

        curr = 1

        for i in range(len(nums)-1,-1,-1):
            pre[i] = curr * pre[i]
            curr = curr*nums[i]

        
        return pre
         