from typing import List


class Solution:
    def countWays(self, ranges: List[List[int]]) -> int:
        ranges = sorted(ranges, key=lambda x: x[0])
        count = 1
        end = ranges[0][1]
        for _b, _e in ranges[1:]:
            if end < _b:
                count += 1
                end = _e
            else:
                end = max(_e, end)

        return int(pow(2,count) % (10**9 + 7))

if __name__ == '__main__':
    print(Solution().countWays([[7, 10], [5,6]]))
