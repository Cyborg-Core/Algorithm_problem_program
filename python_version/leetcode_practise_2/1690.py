class Solution:
    def stoneGameVII(self, stones: List[int]) -> int:
        pre = [0]
        for s in stones:
            pre.append(pre[-1] + s)

        @cache
        def dfs(i, j):
            if i > j: return 0
            return max(pre[j + 1] - pre[i + 1] - dfs(i + 1, j), pre[j] - pre[i] - dfs(i, j - 1))

        res = dfs(0, len(stones) - 1)
        dfs.cache_clear()
        return res
