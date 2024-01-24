from typing import List

def dist(p1, p2):
    return (p1[0] - p2[0]) ** 2 + (p1[1] - p2[1]) ** 2


class Solution:
    def numberOfBoomerangs(self, points: List[List[int]]) -> int:
        count = 0
        record = dict()
        for i in range(len(points)):
            record[i] = dict()
        for i in range(len(points)):
            for j in range(0, len(points)):
                if i == j:
                    continue
                tmp = dist(points[i],points[j])
                if tmp in record[i]:
                    count += 2* record[i][tmp]
                    record[i][tmp] += 1
                else:
                    record[i][tmp] = 1

        return count