class Solution:
    def minLength(self, s: str) -> int:
        r=[]
        for i in s:
            if i == 'B' and len(r)>0:
                if r[-1] == 'A':
                    r.pop()
                    continue
            elif i == 'D' and len(r)>0:
                if r[-1] == 'C':
                    r.pop()
                    continue
            r.append(i)
        return len(r)