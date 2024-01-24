from typing import List
# 这道题 运行时间 35ms
# 击败
# 100.00%
# 使用 Python3 的用户
# 但是代码很难看 哈哈哈哈


class Solution:
    def alternatingSubarray(self, nums: List[int]) -> int:
        if nums[1] - nums[0] == 1:
            sub = nums[0:2]
            index = 0
            record = 2
            max_length = 2
        else:
            sub = nums[0:2]
            index = 0
            record = -1
            max_length = -1


        for i in range(2, len(nums)):

            if sub[1] - sub[0] != 1:
                sub = nums[i - 1:i + 1]
                index = i - 1
                continue
            else:
                if record == -1:
                    record = 2
                    max_length = max(max_length, record)


            if (i - index) % 2 == 0:
                if sub[0] == nums[i]:
                    record += 1
                    max_length = max(max_length, record)
                else:
                    sub = nums[i - 1:i + 1]
                    index = i-1
                    record = 2
            else:
                if sub[1] == nums[i]:
                    record += 1
                    max_length = max(max_length, record)
                else:
                    sub = nums[i - 1:i + 1]
                    index = i-1
                    record = 2
        if sub[1] - sub[0] == 1 and record == -1:

            max_length = 2

        return max_length


if __name__ == '__main__':
    print(Solution().alternatingSubarray([1,7,8]))
