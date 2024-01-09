class Solution:
    def minExtraChar(self, s: str, dictionary: List[str]) -> int:
        record = [0] * (len(s) + 1)
        for i in range(1, len(s) + 1):
            record[i] = record[i - 1] + 1
            for d in dictionary:
                if len(d) > i:
                    continue
                else:
                    if s[i - len(d):i] == d:
                        record[i] = min(record[i], record[i - len(d)])
        return record[-1]