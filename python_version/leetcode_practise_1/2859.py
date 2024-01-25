from typing import List


# 1. int.bit_count(i)
# 2. 可以打表

class Solution:
    def bit_count(self, n: int) -> int:
        count = 0
        while n:
            count += n % 2
            n //= 2
        return count

    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        result = 0
        for i, n in enumerate(nums):
            if self.bit_count(i) == k:
                result += n
        return result


if __name__ == '__main__':
    print(Solution().sumIndicesWithKSetBits([5, 10, 1, 5, 2], 1))
