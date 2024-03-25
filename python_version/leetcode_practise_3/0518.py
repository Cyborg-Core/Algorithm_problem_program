class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        record = [0] * (amount + 1)
        record[0] = 1
        for c in coins:
            for i in range(1, amount + 1):
                if i - c >= 0:
                    record[i] += record[i - c]
        return record[-1] 