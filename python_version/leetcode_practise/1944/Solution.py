from typing import List


class Solution:
    def canSeePersonsCount(self, heights: List[int]) -> List[int]:
        stack = []
        result = [0] * len(heights)
        for i, h in reversed([i for i in enumerate(heights)]):
            while stack:
                result[i] += 1
                if h >= stack[-1]:
                    stack.pop()
                else:
                    break
            stack.append(h)
        return result

if __name__ == '__main__':
    height = [10,6,8,5,11,9]
    print(Solution().canSeePersonsCount(height))
