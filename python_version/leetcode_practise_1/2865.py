from typing import List


class Solution:
    def process_left(self, left_elem) -> int:
        result = 0
        if left_elem:
            highest = left_elem[-1]
            for e in reversed(left_elem[:-1]):
                if e >= highest:
                    result +=highest
                else:
                    result +=e
                    highest = e
        return result

    def process_right(self, right_elem) -> int:
        result = 0
        if right_elem:
            highest = right_elem[0]
            for e in right_elem[1:]:
                if e < highest:
                    result += e
                    highest = e
                else:
                    result += highest
        return result

    def maximumSumOfHeights(self, maxHeights: List[int]) -> int:
        max_result = -1
        for i, h in enumerate(maxHeights):
            max_result = max(max_result, self.process_left(maxHeights[:i + 1]) + self.process_right(maxHeights[i:]) + h)
        return max_result

if __name__ == '__main__':
    print(Solution().maximumSumOfHeights([5,3,4,1,1]))