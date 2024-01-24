from typing import List


class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        result = []
        for w in words:
            result.extend([i for i in w.split(separator) if i ])
        return result