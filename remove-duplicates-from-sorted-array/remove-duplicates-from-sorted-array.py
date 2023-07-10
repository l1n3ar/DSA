class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        current = nums[0]
        i = 1
        j=1
        while(i < len(nums)):
            if current == nums[i]:
                i+=1
            else:
                nums[j] = nums[i]
                current=nums[j]
                i+=1
                j+=1
        return j