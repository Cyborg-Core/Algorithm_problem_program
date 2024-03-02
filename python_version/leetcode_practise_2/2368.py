from typing import List


class Solution:

    def dfs(self, root, father):
        if root in self.restricted:
            return 0
        result = 1
        for c in self.child[root]:
            if c != father:
                result += self.dfs(c, root)
        return result

    def reachableNodes(self, n: int, edges: List[List[int]], restricted: List[int]) -> int:
        self.restricted = set(restricted)
        self.child = dict()
        for n1,n2 in edges:
            if n1 in self.child:
                self.child[n1].append(n2)
            else:
                self.child[n1] = [n2]

            if n2 in self.child:
                self.child[n2].append(n1)
            else:
                self.child[n2] = [n1]
        return self.dfs(0, -1)

if __name__ == '__main__':
    print(Solution().reachableNodes(7, [[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]], [4,2,1]))