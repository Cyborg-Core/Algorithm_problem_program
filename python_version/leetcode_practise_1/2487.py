# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        socket = ListNode()
        socket.next = head
        stack = []
        while socket.next != None:
            curr = socket.next
            socket.next = curr.next
            curr.next = None
            while True:
                if len(stack) > 0 and curr.val > stack[-1].val:
                    stack.pop()
                else:
                    stack.append(curr)
                    break
        for n in reversed(stack):
            n.next = socket.next
            socket.next = n
        return socket.next