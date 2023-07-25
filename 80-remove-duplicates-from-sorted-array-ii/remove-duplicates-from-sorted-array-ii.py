class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        i,j,cnt,n,curr = 1,1,1,len(nums),nums[0]

        while(i < n and j < n):
            
            if nums[i] == curr:
                cnt+=1
                if cnt <= 2:
                    nums[j] = curr
                    j+=1
            else:
                nums[j] = nums[i]
                curr = nums[i]
                cnt = 1
                j+=1
            i+=1

           

        return j                


