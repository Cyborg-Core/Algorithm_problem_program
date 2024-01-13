from collections import Counter


class Solution:
    def repeatLimitedString(self, s: str, repeatLimit: int) -> str:
        record = Counter(s)
        sorted_chars = sorted(record.keys(), reverse=True) + ["0"]
        result = ""
        max_char_idx = 0
        smaller_char_idx = 1
        while True:
            # 找到插入的字符
            max_char = sorted_chars[max_char_idx]
            if max_char == "0":
                break
            smaller_char = sorted_chars[smaller_char_idx]

            # 插入
            letter_count = min(repeatLimit, record[max_char])
            result += max_char * letter_count
            record[max_char] -= letter_count

            # 判断为空
            if record[max_char] == 0:
                max_char_idx = smaller_char_idx
                smaller_char_idx = max_char_idx + 1
                continue
            else:
                if smaller_char == "0":
                    break
                else:
                    result += smaller_char
                    record[smaller_char] -= 1
                    if record[smaller_char] == 0:
                        smaller_char_idx += 1

        return result


if __name__ == '__main__':
    print(Solution().repeatLimitedString("cczazccccaaaa", 3))
