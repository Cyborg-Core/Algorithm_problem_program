class MyHashMap:

    def __init__(self):
        self.record  = dict()


    def put(self, key: int, value: int) -> None:
        self.record[key] = value

    def get(self, key: int) -> int:
        if key in self.record:
            return self.record[key]
        else:
            return -1


    def remove(self, key: int) -> None:
        if key in self.record:
            del self.record[key]


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)