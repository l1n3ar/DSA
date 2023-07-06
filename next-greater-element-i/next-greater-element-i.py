class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result: List[int] = []
        for current in nums1:
            idx2 = nums2.index(current)
            j = len(nums2) - 1
            current_max = -1
            while (j > idx2):
                if nums2[j] > current:
                    current_max = nums2[j]
                j-=1
            result.append(current_max)
        return result