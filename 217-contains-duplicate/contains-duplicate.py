
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:

        set_ = set(nums)
        return len(set_) != len(nums)
        