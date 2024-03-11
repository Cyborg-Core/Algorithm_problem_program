class Solution:
    def capitalizeTitle(self, title: str) -> str:
        word = title.split()
        result = []
        for w in word:
            if len(w) <=2:
                result.append( w.lower())
            else:
                result.append(w[0].upper() + w[1:].lower())
        return " ".join(result)

if __name__ == '__main__':
    print(Solution().capitalizeTitle("capiTalIze tHe OF titLe"))