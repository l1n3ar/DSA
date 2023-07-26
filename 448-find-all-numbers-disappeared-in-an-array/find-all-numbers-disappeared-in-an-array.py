class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:

        a = [False] * (len(nums) + 1)
        res = []

        for n in nums:
            a[n] = True
        
        for i in range(1,len(a)):
            if not a[i] : res.append(i)

        return res 