# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
        if original == target:
            return cloned
        r = None
        if cloned.left:
            r = self.getTargetCopy(original.left, cloned.left,target)
        if cloned.right and r == None:
            r = self.getTargetCopy(original.right, cloned.right,target)
        return r