class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        ele = nums[0]
        cnt = 1

        for i in range(1,len(nums)):

            if ele == nums[i]:
                cnt+=1
            else:cnt-=1

            if cnt == 0:
                ele = nums[i]
                cnt = 1
        
        return ele
