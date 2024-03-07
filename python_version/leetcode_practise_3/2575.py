class Solution:
    def divisibilityArray(self, word: str, m: int) -> List[int]:
        c2i = {
            "0":0,"1":1,"2":2,"3":3,"4":4,
            "5":5,"6":6,"7":7,"8":8,"9":9,
        }
        result = [0] * len(word)
        total = 0
        for i, c in enumerate(word):
            total = (total*10 + c2i[c]) % m
            if total % m == 0:
                result[i] = 1
        return result