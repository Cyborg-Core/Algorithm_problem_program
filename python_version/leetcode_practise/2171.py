class Solution:
    def minimumRemoval(self, beans: List[int]) -> int:
        beans.sort()
        total = sum(beans)
        length = len(beans)
        min_result = 2e31
        for i, height in enumerate(beans):
            min_result = min(min_result, total - height * (length - i))
        return min_result