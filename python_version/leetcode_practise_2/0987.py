# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
from operator import itemgetter
from queue import Queue
from typing import Optional, List


class Solution:
    def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
        q = Queue()
        q.put((0, 0, root))
        result = []
        tmp_record = []
        while not q.empty():
            r, c, n = q.get()
            # the child of n put into queue
            if n.left:
                q.put((r + 1, c - 1, n.left))
            if n.right:
                q.put((r + 1, c + 1, n.right))
            tmp_record.append((r, c, n.val))
        tmp_record = sorted(tmp_record, key=itemgetter(1,0,2))
        column = tmp_record[0][1]
        row = tmp_record[0][0]
        tmp = []
        for r,c,n in tmp_record:
            if c != column:
                result .append(tmp)
                tmp = []
                row = r
                column = c
            tmp.append(n)
        result .append(tmp)
        return result
