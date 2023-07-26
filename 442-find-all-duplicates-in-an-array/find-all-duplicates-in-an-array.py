class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:

        ans = [False] * (len(nums) + 1)
        res = []

        for i in nums:
            if ans[i] : res.append(i)
            ans[i] = True

        return res