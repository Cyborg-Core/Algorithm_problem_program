from typing import List


class Solution:
    def maxDistToClosest(self, seats: List[int]) -> int:
        max_l = 0
        flag = True
        record = 1
        for i in seats:
            if i == 1:
                max_l = max(max_l,record)
                record =1

            else:
                record+=1
        return max_l
#
# class Solution:
#     def maxDistToClosest(self, seats: List[int]) -> int:
#         left = [100000] * len(seats)
#         count = 1 - seats[0]
#         for i in range(1, len(seats)):
#             if seats[i] == 1:
#                 left[i] = -1
#                 count = 0
#             else:
#                 count +=1
#                 left[i] = count
#         count = 1000000
#         result = 0
#         for j in range(len(seats)-1, -1, -1):
#             if seats[j] == 0:
#                 result = max(result,min(count, left[j]))
#                 count +=1
#             else:
#                 count = 1
        return result
if __name__ == '__main__':
    print(Solution().maxDistToClosest([0,0,0,0,1,0,0,0]))