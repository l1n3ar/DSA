class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        i,j,idx = m - 1,n - 1,len(nums1) - 1


        while(j >= 0):

            
            if i>=0 and nums1[i] >= nums2[j]:
                nums1[idx] = nums1[i]
                i-=1
            else:
                nums1[idx] = nums2[j]
                j-=1
            idx-=1




        