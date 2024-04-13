class Solution:
    def findChampion(self, n: int, edges: List[List[int]]) -> int:
        lose= set([i[1] for i in edges])
        if n - len(lose) != 1:
            return -1
        else:
            result = set([ i for i in range(n)]) - lose
            return list(result)[0]