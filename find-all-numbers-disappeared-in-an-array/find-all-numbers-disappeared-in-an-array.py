class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        
        return list(set(nums)^set(range(1,len(nums)+1)))