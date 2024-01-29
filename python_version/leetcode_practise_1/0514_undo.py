class Solution:
    def findRotateSteps(self, ring: str, key: str) -> int:
        # 先用一个哈希表存放ring中各个字母的索引
        hs = dict()
        for i in range(len(ring)):
            if ring[i] not in hs:
                hs[ring[i]] = [i]
            else:
                hs[ring[i]].append(i)

        # 初始化dp数组，包括初始化第一行
        m, n = len(ring), len(key)
        dp = [float('inf')] * m
        for q in hs[key[0]]:
            dp[q] = min(q, m - q) + 1

        for i in range(1, n):
            # 分为两种情况：1.正在处理的字母与上一个字母不同；2.正在处理的字母与上一个字母相同；
            if key[i] != key[i - 1]:
                for p in hs[key[i - 1]]:
                    for j in hs[key[i]]:
                        dp[j] = min(dp[j], min(abs(j - p), m - abs(j - p)) + dp[p] + 1)
                    dp[p] = float('inf')
            else:
                for j in hs[key[i]]:
                    # tmp = float('inf')
                    # for p in hs[key[i-1]]:
                    #     tmp = min(tmp,min(abs(j-p),m-abs(j-p))+dp[p]+1)
                    # dp[j] = tmp
                    dp[j] += 1
        return min(dp)