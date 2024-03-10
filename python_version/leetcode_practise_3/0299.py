from collections import Counter


class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        s_d = Counter(secret)
        g_d = Counter(guess)
        same_d = dict()
        for i,j in zip(secret, guess):
            if i == j:
                if i in same_d:
                    same_d[i]+=1
                else:
                    same_d[i] = 1

        a = 0
        b = 0
        for key in s_d.keys():
            tmp_a = 0
            if key in same_d:
                tmp_a = same_d[key]
            if key in g_d:
                b += (min(g_d[key], s_d[key]) - tmp_a)
            a += tmp_a
        return f"{a}A{b}B"


