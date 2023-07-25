class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        current= nums[0]
        i,j,k = 1,1,1

        while (i < len(nums) and j < len(nums)):

            if nums[i] != current:
                k+=1
                nums[j] = nums[i]
                current = nums[i]
                i+=1
                j+=1
            else:
                i+=1

        return k
        