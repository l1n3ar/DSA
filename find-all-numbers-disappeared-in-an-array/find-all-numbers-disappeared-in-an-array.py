class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        set_ = {num for num in nums}
        result : List[int] = []
        for i in range(1,len(nums)+1,1):
            if i not in set_:
                result.append(i)

        return result