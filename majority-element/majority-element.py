class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        elements = {}
        length = len(nums)
        for i in range(len(nums)):
            current = nums[i]
            if current in elements:
                elements[current]+=1
            else:
                elements[current]=1
        print(elements)
        for element in elements:
            if (elements[element]>length/2):
                return element
        return 0