# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self, root, record):
        if not root:
            return

        self.dfs(root.left, record)
        self.dfs(root.right, record)
        record.append(root.val)

    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        record = []
        self.dfs(root, record)
        return record