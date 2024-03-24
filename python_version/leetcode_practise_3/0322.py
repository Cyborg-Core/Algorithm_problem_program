class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        record = [100000000] * (amount + 1)
        record[0] = 0
        for i in range(1, amount + 1):
            for c in coins:
                if i - c >= 0:
                    record[i] = min(record[i], record[i - c] + 1)
        return record[-1] if record[-1] != 100000000 else -1
