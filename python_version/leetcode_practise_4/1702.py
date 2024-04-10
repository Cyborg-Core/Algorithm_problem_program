class Solution:
    def maximumBinaryString(self, binary: str) -> str:
        n = len(binary)
        i = binary.find("0")
        if i < 0:
            return binary
        zeros = binary.count('0')
        s = ['1'] * n
        s[i + zeros - 1] = '0'
        return ''.join(s)
