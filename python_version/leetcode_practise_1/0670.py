class Solution:
    def maximumSwap(self, num: int) -> int:
        s = list([i for i in str(num)])
        max_v = sorted(list(set(s)))
        rd = {
            "9": [],
            "8": [],
            "7": [],
            "6": [],
            "5": [],
            "4": [],
            "3": [],
            "2": [],
            "1": [],
            "0": [],
        }

        for i, c in enumerate(s):
            rd[c] = [i] + rd[c]

        for i, c in enumerate(s):
            # 判断是否是最大值 如果是就跳过
            if c == max_v[-1]:
                rd[c].pop()
                if not rd[c]:
                    max_v.pop()
                continue
            else:
                s[i] = max_v[-1]
                s[rd[max_v[-1]][0]] = c
                break
        result = 0
        for _s in s:
            result = result*10 + int(_s)
        return result


if __name__ == '__main__':
    print(Solution().maximumSwap(1993))
