# Definition for a binary tree node.
from queue import Queue
from typing import Optional

class Solution:

    def kthLargestLevelSum(self, root: Optional[TreeNode], k: int) -> int:
        if not root:
            return []
        q = Queue()
        q.put((0, root))
        result = []
        tmp_record = 0
        row = 0
        while not q.empty():
            r, n = q.get()

            # the child of n put into queue
            if n.left:
                q.put((r + 1, n.left))
            if n.right:
                q.put((r + 1, n.right))

            if r != row:
                result.append(tmp_record)
                row = r
                tmp_record = 0
            tmp_record+=n.val
        result.append(tmp_record)

        return sorted(result,reverse=True)[k-1] if len(result) >=k else -1
