class Solution:
    def rootCount(self, edges: List[List[int]], guesses: List[List[int]], k: int) -> int:
        n = len(edges) + 1
        g = [[] for _ in range(n)]
        st = set()

        def h(x, y):
            return x << 20 | y

        for x, y in edges:
            g[x].append(y)
            g[y].append(x)
        for u, v in guesses:
            st.add(h(u, v))

        res, cnt = 0, 0

        def dfs(x, fat):
            nonlocal cnt
            for y in g[x]:
                if y == fat:
                    continue
                cnt += h(x, y) in st
                dfs(y, x)

        dfs(0, -1)

        def redfs(x, fat, cnt):
            nonlocal res
            if cnt >= k:
                res += 1
            for y in g[x]:
                if y == fat:
                    continue
                redfs(y, x, cnt - (h(x, y) in st) + (h(y, x) in st))

        redfs(0, -1, cnt)

        return res


