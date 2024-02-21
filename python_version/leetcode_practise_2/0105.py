# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        if not preorder:
            return None
        if len(preorder) == 1:
            return TreeNode(val=preorder[0])
        root_v = preorder[0]
        mid_i = inorder.index(root_v)
        root = TreeNode(
            root_v,
            self.buildTree(preorder[1:mid_i+1], inorder[:mid_i]),
            self.buildTree(preorder[mid_i+1:], inorder[mid_i+1:]),
        )
        return root