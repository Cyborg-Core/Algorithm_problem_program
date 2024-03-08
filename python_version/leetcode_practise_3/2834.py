class Solution:
    def sum_of_arithmetic_sequence(self, a1, an, n):
        if a1 > an:
            return 0
        a = (a1 + an)
        return a*n // 2
    def minimumPossibleSum(self, n: int, target: int) -> int:
        first_end = min(target // 2, n)
        result = self.sum_of_arithmetic_sequence(1, first_end, first_end)
        result += self.sum_of_arithmetic_sequence(target, target + n - first_end -1,  n - first_end)
        return int(result % (1e9 +7))