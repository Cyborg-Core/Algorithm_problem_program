# from idlelib.tree import TreeNode
from typing import Optional


class Solution:
    def isCousins(self, root: Optional[TreeNode], x: int, y: int) -> bool:
        self.xl = -1
        self.yl = -2
        self.xf = -3
        self.yf = -4
        self.x = x
        self.y = y
        self.dfs(root,0,None)
        return self.xl == self.yl and self.xf != self.yf

    def dfs(self, root, level,father):
        if not root:
            return
        if root.val == self.x:
            self.xl = level
            self.xf = father
        if root.val == self.y:
            self.yl = level
            self.yf = father

        self.dfs(root.left, level + 1,root)
        self.dfs(root.right, level + 1,root)