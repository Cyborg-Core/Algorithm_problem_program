from queue import Queue
class Solution:
    def preorder(self, root: "Node") -> List[int]:
        if not root:
            return []
        q = []
        q.append(root)
        result = []
        while q:

            n = q.pop()
            result.append(n.val)
            # the child of n put into queue
            for c in n.children[::-1]:
                q.append(c)

        return result

