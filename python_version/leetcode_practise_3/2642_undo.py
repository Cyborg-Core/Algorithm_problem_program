class Graph:
    def __init__(self, n: int, edges: List[List[int]]):
        self.dist = [[inf] * n for _ in range(n)]
        for i in range(n):
            self.dist[i][i] = 0
        for x, y, cost in edges:
            self.dist[x][y] = cost
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    self.dist[i][j] = min(self.dist[i][j], self.dist[i][k] + self.dist[k][j])

    def addEdge(self, edge: List[int]) -> None:
        x, y, cost = edge[0], edge[1], edge[2]
        if cost >= self.dist[x][y]:
            return
        n = len(self.dist)
        for i in range(n):
            for j in range(n):
                self.dist[i][j] = min(self.dist[i][j], self.dist[i][x] + cost + self.dist[y][j])

    def shortestPath(self, node1: int, node2: int) -> int:
        res = self.dist[node1][node2]
        return res if res != inf else -1
