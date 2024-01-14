from typing import List


class ExamRoom:

    def __init__(self, n: int):
        self.seat_list = [0] * n

    def seat(self) -> int:
        max_dis = self.maxDistToClosest()
        self.seat_list[max_dis] = 1
        return max_dis

    def leave(self, p: int) -> None:
        self.seat_list[p] = 0
        return None

    def maxDistToClosest(self) -> int:
        left = [2000000000] * len(self.seat_list)
        count = 1 - self.seat_list[0]
        for i in range(1, len(self.seat_list)):
            if self.seat_list[i] == 1:
                left[i] = -1
                count = 0
            else:
                count +=1
                left[i] = count
        print(left)
        count = 2000000000
        result = 0
        idx = -1
        for j in range(len(self.seat_list)-1, -1, -1):
            if self.seat_list[j] == 0:
                max_dis = min(count, left[j])
                if result >= max_dis:
                    result = max_dis
                    idx = j
                count +=1
            else:
                count = 1
        return result
