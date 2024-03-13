class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        d = Counter(s)
        return "1"*(d["1"]-1) + "0"*d["0"] + "1"