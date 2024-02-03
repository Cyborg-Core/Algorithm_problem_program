class Solution:
    def stoneGameVI(self, aliceValues: List[int], bobValues: List[int]) -> int:
        values = [[a+b, a, b] for a, b in zip(aliceValues, bobValues)]
        values.sort(reverse=True)
        aliceSum, bobSum = sum(value[1] for value in values[::2]), sum(value[2] for value in values[1::2])
        if aliceSum > bobSum:
            return 1
        elif aliceSum == bobSum:
            return 0
        else:
            return -1

