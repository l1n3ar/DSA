class NumArray:

    def __init__(self, nums: List[int]):
        self.nums = nums
        self.prefix_sum = []
        self.prefix_sum.append(0)
        for index,num in enumerate(nums):
            self.prefix_sum.append(self.prefix_sum[index] + num)
        

    def sumRange(self, left: int, right: int) -> int:
       return self.prefix_sum[right+1] - self.prefix_sum[left]

        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)