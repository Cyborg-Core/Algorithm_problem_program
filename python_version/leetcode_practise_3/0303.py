class NumArray:

    def __init__(self, nums: List[int]):
        self.record = [0] * (len(nums) + 1)
        for i, n in enumerate(nums):
            self.record[i+1] = self.record[i] + n


    def sumRange(self, left: int, right: int) -> int:
        return self.record[right+1] - self.record[left]



# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)