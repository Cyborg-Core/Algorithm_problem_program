# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from queue import Queue
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
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
            if n.left:
                q.put((r + 1, n.left))
            if n.right:
                q.put((r + 1, n.right))

            if r != row:
                result.append(tmp_record)
                row = r
                tmp_record = []
            tmp_record.append(n.val)
        result.append(tmp_record)
        return result[::-1]