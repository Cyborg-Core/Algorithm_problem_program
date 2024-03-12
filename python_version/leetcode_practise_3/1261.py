# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
from typing import Optional


class FindElements:
    def dfs(self,root,val,l_r):
        if not root:
            return
        root.val = val*2 + l_r
        self.search_set.add(root.val)
        self.dfs(root.left, root.val, 1)
        self.dfs(root.right, root.val, 2)


    def __init__(self, root: Optional[TreeNode]):
        self.search_set = {0}
        root.val = 0
        if root.left:
            self.dfs(root.left, val=0, l_r=1)
        if root.right:
            self.dfs(root.right,val=0, l_r=2)


    def find(self, target: int) -> bool:
        return target in self.search_set



# Your FindElements object will be instantiated and called as such:
# obj = FindElements(root)
# param_1 = obj.find(target)