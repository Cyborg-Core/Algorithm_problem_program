from collections import Counter


class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        m_c = Counter(magazine)
        for k, v in Counter(ransomNote):
            try:
                if m_c[k] < v:
                    return False
            except:
                pass
        return True
