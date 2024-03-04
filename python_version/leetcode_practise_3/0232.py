class MyQueue:

    def __init__(self):
        self.ins = []
        self.out = []

    def push(self, x: int) -> None:
        self.ins.append(x)


    def pop(self) -> int:
        if not self.out:
            while self.ins:
                self.out.append(self.ins.pop())
        return self.out.pop()

    def peek(self) -> int:
        if not self.out:
            while self.ins:
                self.out.append(self.ins.pop())
        return self.out[-1]
    def empty(self) -> bool:
        if self.ins or self.out:
            return False
        return True



# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()