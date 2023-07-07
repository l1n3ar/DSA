class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        set_ = {num for num in nums}
        result : List[int] = []
        for i in range(len(nums)):
            if i+1 not in set_:
                result.append(i+1)

        return result