class Solution:
    def firstDayBeenInAllRooms(self, nextVisit: List[int]) -> int:
        mod = 10**9 + 7
        dp = [0] * (len(nextVisit))

        #初始化原地待一天+访问下一个房间一天
        dp[0] = 2
        for i in range(1, len(nextVisit)):
            to = nextVisit[i]
            dp[i] = 2 + dp[i - 1]
            if to != 0:
                dp[i] = (dp[i] - dp[to - 1]) % mod
            dp[i] = (dp[i] + dp[i - 1]) % mod
        return dp[len(nextVisit) - 2] # 题目保证n >= 2
