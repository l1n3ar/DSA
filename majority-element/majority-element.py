class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        current_max = nums[0]
        count = 1
        for i in range(1,len(nums)):
            print("Current Max : ",current_max)
            current = nums[i]
            if current == current_max:
                count+=1
            else:
                count-=1
            if count==0:
                current_max = current
                count=1
        
        if count>0:
            return current_max
        return 0
