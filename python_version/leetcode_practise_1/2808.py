from typing import List



class Solution:
    def minimumSeconds(self, nums: List[int]) -> int:
        l = len(nums)
        record = dict()
        max_distance =dict()
        for i, n in enumerate(nums):
            if n in record:
                max_distance[n] = max(max_distance[n], i - record[n][-1] )
                record[n] += [i]
            else:
                record[n] = [i]
                max_distance[n] = -1
        for key, value in record.items():
            max_distance[key] = max(max_distance[key], value[0] - value[-1] + l)
        return min(max_distance.values()) // 2
if __name__ == '__main__':
    print(Solution().minimumSeconds([8,13,3,3,3]))