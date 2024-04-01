class Solution:
    def finalString(self, s: str) -> str:
        result= []
        for c in s:
            if c == "i":
                result = result[::-1]
            else:
                result.append(c)
        return "".join(result)