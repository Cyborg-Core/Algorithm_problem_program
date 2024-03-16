class Solution:

    def maxMoves(self, grid: List[List[int]]) -> int:
        self.m = len(grid)
        self.n = len(grid[0])
        self.grid = grid
        self.record = [[0] * self.n for i in range(self.m)]

        @cache
        def dfs(i: int, j: int) -> int:
            # print(i,j)
            if j == self.n - 1:
                return j

            result = [
                dfs(r, j + 1) if self.grid[i][j] < self.grid[r][j + 1] else j
                for r in range(max(0, i - 1), min(self.m, i + 2))
            ]

            return max(result)

        return max([dfs(r, 0) for r in range(self.m)])