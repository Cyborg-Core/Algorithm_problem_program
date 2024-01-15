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
        max_l = 0
        flag = False
        record = 0
        result = -1
        for i, s in reversed([i for i in enumerate(self.seat_list)]):
            if s == 1:
                if flag:
                    if max_l <= (record + 1) // 2:
                        max_l = (record + 1) // 2
                        result = i
                else:
                    if max_l <= record:
                        max_l = record
                        result = i

                flag = True
                record = 0
            else:
                record += 1
        if self.seat_list[-1] == 0:
            if max_l <= record:
                result = len(self.seat_list) -1
        return result
