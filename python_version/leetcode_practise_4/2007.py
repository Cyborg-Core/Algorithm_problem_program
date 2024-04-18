from collections import Counter
from typing import List


class Solution:
    def findOriginalArray(self, changed: List[int]) -> List[int]:
        counter = Counter(changed)
        changed.sort(reverse=True)
        result = []
        for i in changed:
            if i %2 ==1:
                continue
            h = i // 2
            if h in counter and counter[i] >0:
                counter[h] -=1
                counter[i] -=1
                result.append(h)
        for i in counter.values():
            if i != 0:
                return []

        return result

# class Solution:
#     def findOriginalArray(self, changed: List[int]) -> List[int]:
#         changed.sort()
#         count = Counter(changed)
#         res = []
#         for a in changed:
#             if count[a] == 0:
#                 continue
#             count[a] -= 1
#             if count[a * 2] == 0:
#                 return []
#             count[a * 2] -= 1
#             res.append(a)
#         return res
#
# 作者：力扣官方题解
# 链接：https://leetcode.cn/problems/find-original-array-from-doubled-array/solutions/2740671/cong-shuang-bei-shu-zu-zhong-huan-yuan-y-0vgc/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

if __name__ == '__main__':
    print(Solution().findOriginalArray([1,3,4,2,6,8]))