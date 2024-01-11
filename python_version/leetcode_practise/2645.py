class Solution:
    def addMinimum(self, word: str) -> int:
        word = word + "a"
        q = "a"
        result = 0
        for w in word:
            if w != q:
                result += (ord(w) - ord(q) +3) %3
            if w == "a":
                q = "b"
            elif w == "b":
                q = "c"
            elif w == "c":
                q = "a"
        return result
