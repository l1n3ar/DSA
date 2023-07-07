class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        candidate = nums[0]
        count = 1
        length = len(nums)
        
        for i in range(1,length,1):

            current=nums[i]
           
            if (current==candidate):
                count+=1
            else:
                count-=1
            
            if (count==0):
                candidate=current
                count=1  
                
        count=0
 
        for num in nums:
            if (num==candidate):
                count+=1

        if (count > length/2):
            return candidate
        return -1  