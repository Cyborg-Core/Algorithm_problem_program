from typing import List


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        l = len(nums)
        left = [0] * l
        right = [0] * l
        for i in range(1, l):
            left[i] = left[i-1] + nums[i-1]
        for i in range(l-2, -1, -1):
            right[i] = right[i+1] + nums[i+1]
        for i in range(l):
            if left[i] == right[i]:
                return i
        return -1

    def findMiddleIndex(self, nums: List[int]) -> int:
        l = len(nums)
        left = [0] * l
        right = [0] * l
        for i in range(1, l):
            left[i] = left[i - 1] + nums[i - 1]
        for i in range(l - 2, -1, -1):
            right[i] = right[i + 1] + nums[i + 1]
        for i in range(l):
            if left[i] == right[i]:
                return i
        return -1