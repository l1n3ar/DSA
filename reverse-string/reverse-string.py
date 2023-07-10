class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
    
        left = 0
        right = len(s) - 1

        while(left <= right):
            self.swap(s,left,right)
            left+=1
            right-=1
    
        return s
    
    def swap(self,s,left,right):
        temp = s[left]
        s[left] = s[right]
        s[right] = temp
        

