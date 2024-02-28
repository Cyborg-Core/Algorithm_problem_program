class Solution:

    def dfs(self, idx, n, cost):
        if idx * 2 > n:
            return cost[idx - 1]
        l = self.dfs(idx * 2, n, cost)
        r = self.dfs(idx * 2 + 1, n, cost)
        self.result += abs(l - r)
        return max(l, r) + cost[idx - 1]

    def minIncrements(self, n: int, cost: List[int]) -> int:
        self.result = 0
        self.dfs(1, n, cost)
        return self.result
