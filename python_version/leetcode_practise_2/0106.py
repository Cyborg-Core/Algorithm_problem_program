class Solution:

    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        if not postorder:
            return None
        if len(postorder) == 1:
            return TreeNode(val=postorder[-1])
        root_v = postorder[-1]
        mid_i = inorder.index(root_v)
        root = TreeNode(
            root_v,
            self.buildTree( inorder[:mid_i],postorder[:mid_i]),
            self.buildTree( inorder[mid_i+1:],postorder[mid_i:-1]),
        )
        return root