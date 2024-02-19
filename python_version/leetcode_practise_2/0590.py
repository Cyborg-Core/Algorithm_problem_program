"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""


class Solution:
    def dfs(self, root, result):
        if not root:
            return result
        for n in root.children:
            self.dfs(n, result)
        result.append(root.val)
        return result

    def postorder(self, root: 'Node') -> List[int]:
        result = []
        self.dfs(root, result)
        return result
