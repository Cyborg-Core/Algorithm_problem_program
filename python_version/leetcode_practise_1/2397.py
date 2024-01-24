from typing import List, Set


class Solution:
    def dfs(self, index, max_index, c_set: Set, row_count):
        if index == max_index:
            return
        self.dfs(index + 1, max_index, c_set, row_count)
        new_c_set = c_set | self.record_sets[index]
        if len(new_c_set) <= self.numSelect:
            print(index)
            self.max_count = max(self.max_count, row_count + 1)
            self.dfs(index + 1, max_index, new_c_set, row_count + 1)

    def maximumRows(self, matrix: List[List[int]], numSelect: int) -> int:
        self.record_sets = []
        for line in matrix:
            self.record_sets.append(set([i for i in range(len(line)) if line[i] == 1]))

        print(self.record_sets)
        self.max_count = 0
        self.numSelect = numSelect

        self.dfs(0, len(matrix), set(), 0)
        return self.max_count


if __name__ == '__main__':
    matrix = [
        [1, 0],
        [0, 1],
        [1, 1]
    ]
    num = 1
    print(Solution().maximumRows(matrix, num))
