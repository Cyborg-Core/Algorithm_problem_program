# 埃氏筛
N = 100001
is_prime = [True] * N
is_prime[1] = False
for i in range(2, N):
    if is_prime[i]:
        for j in range(i * i, N, i):
            is_prime[j] = False

class Solution:
    def countPaths(self, n: int, edges: List[List[int]]) -> int:
        G = [[] for _ in range(n + 1)]
        for i, j in edges:
            G[i].append(j)
            G[j].append(i)

        def dfs(i, pre):
            seen.append(i)
            for j in G[i]:
                if j != pre and not is_prime[j]:
                    dfs(j, i)

        res = 0
        count = [0] * (n + 1)
        for i in range(1, n + 1):
            if not is_prime[i]:
                continue
            cur = 0
            for j in G[i]:
                if is_prime[j]:
                    continue
                if count[j] == 0:
                    seen = []
                    dfs(j, 0)
                    for k in seen:
                        count[k] = len(seen)
                res += count[j] * cur
                cur += count[j]
            res += cur
        return res

作者：力扣官方题解
链接：https://leetcode.cn/problems/count-valid-paths-in-a-tree/solutions/2654126/tong-ji-shu-zhong-de-he-fa-lu-jing-shu-m-yyuw/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。