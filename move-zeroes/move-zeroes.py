class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        zero_index,i = 0,0
        
        while(i < len(nums)):
            if nums[i] != 0:
                nums[i],nums[zero_index] = nums[zero_index],nums[i]
                i+=1
                zero_index+=1
            else:
                i+=1
        
        return nums