class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        
        result : List[List[int]] = []
        num_list = []
        
        set1_ = set(nums1)
        set2_ = set(nums2)

        for num in set1_:
            
            if num not in set2_:
                num_list.append(num)
        
        result.append(num_list)
        num_list = []
        
        for num in set2_:
       
            if num not in set1_:
                num_list.append(num)

        result.append(num_list)

        return result