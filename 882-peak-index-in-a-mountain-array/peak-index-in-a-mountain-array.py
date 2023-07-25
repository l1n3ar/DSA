class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        
        l,r = 0,len(arr) - 1
        

        while (l <= r):

            print("Left",l)
            print("Right",r)
            mid = (l + r) // 2

            if arr[mid-1] < arr[mid] and arr [mid+1] < arr[mid] : return mid

            if arr[mid-1] < arr[mid] and arr[mid+1] > arr[mid] : 
                l = mid
            else : r = mid
        

        return -1
