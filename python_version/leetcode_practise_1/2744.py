class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        r=set()
        c=0
        for w in words:
            if w in r:
                c+=1
            r.add(w[::-1])
        return c