from collections import Counter
from typing import List


class Solution:
    def countWords(self, words1: List[str], words2: List[str]) -> int:
        a = Counter(words1)
        b = Counter(words2)
        count = 0
        for key in a:
            if key in a and key in b and a[key] == b[key] == 1:
                count +=1
        return count