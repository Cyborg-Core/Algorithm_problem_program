"""
# Definition for a Node.

"""
from queue import Queue


class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
from typing import List


class Solution:
    def levelOrder(self, root: Node) -> List[List[int]]:
        if not root:
            return []
        q = Queue()
        q.put((0, root))
        result = []
        tmp_record = []
        row = 0
        while not q.empty():
            r, n = q.get()

            # the child of n put into queue
            for c in n.children:
                q.put((r + 1, c))
      
            if r != row:
                result.append(tmp_record)
                row = r
                tmp_record = []
            tmp_record.append(n.val)
        result.append(tmp_record)
        return result
