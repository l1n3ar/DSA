class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        pre,post,res = [1] * len(nums), [1] * len(nums),[0] * len(nums)
        curr = 1

        for i in range(len(nums)):
            pre[i] = curr
            curr = curr*nums[i]

        curr = 1
        for i in range(len(nums)-1,-1,-1):
            post[i] = curr
            curr = curr*nums[i]
            
        for i in range(len(nums)):
            res[i] = pre[i] * post[i]
        
        return res
         