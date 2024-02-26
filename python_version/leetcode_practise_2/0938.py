class Solution:
    def dfs(self, root: Optional[TreeNode], low: int, high: int):
        if not root:
            return
        if low <= root.val <= high:
            self.result += root.val
        if not root.val < low:
            self.dfs(root.left,low,high)
        if not root.val >high:
            self.dfs(root.right,low,high)
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        self.result = 0
        self.dfs(root,low,high)
        return self.result