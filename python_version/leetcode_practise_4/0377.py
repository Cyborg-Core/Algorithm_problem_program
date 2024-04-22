class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
        nums.sort()
        record = [1] + [0] * target
        for j in range(1, target + 1):
            for n in nums:
                if j - n >= 0:
                    record[j] += record[j - n]
                else:
                    break
        return record[-1]