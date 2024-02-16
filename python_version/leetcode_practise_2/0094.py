class Solution:

    def dfs(self, root, result):
        if not root:
            return
        self.dfs(root.left, result)
        result.append(root.val)
        self.dfs(root.right, result)

    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result = []
        self.dfs(root, result)
        return result