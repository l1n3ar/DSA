from typing import List

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k % n

        def reverse(l, r):
            while l < r:
                nums[l], nums[r] = nums[r], nums[l]
                l += 1
                r -= 1

        # Reverse the whole list
        reverse(0, n - 1)

        # Reverse the first k elements
        reverse(0, k - 1)

        # Reverse the remaining elements
        reverse(k, n - 1)
