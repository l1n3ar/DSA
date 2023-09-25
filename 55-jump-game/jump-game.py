class Solution:
    def canJump(self, nums: List[int]) -> bool:

        jumps = [False] * len(nums)
        jumps[len(nums) - 1] = True
        i = len(nums) - 2
        goal = len(nums) - 1

        while i >= 0:
            if i + nums[i] >= goal:
                jumps[i] = True
                goal = i
            i-=1



        return jumps[0]

        