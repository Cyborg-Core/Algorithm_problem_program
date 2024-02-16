class Solution:
    def maxResult(self, nums: List[int], k: int) -> int:
        n = len(nums)
        dp = [0] * n
        dp[0] = nums[0]
        queue = deque([0])
        for i in range(1, n):
            while queue and queue[0] < i - k:
                queue.popleft()
            dp[i] = dp[queue[0]] + nums[i]
            while queue and dp[queue[-1]] <= dp[i]:
                queue.pop()
            queue.append(i)
        return dp[n - 1]
