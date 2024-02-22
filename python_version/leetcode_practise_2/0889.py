class Solution:
    def constructFromPrePost(self, preorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        if not preorder:
            return None
        if len(preorder) == 1:
            return TreeNode(val=preorder[0])
        root_v = preorder[0]
        mid_i = postorder.index(preorder[1])
        root = TreeNode(
            root_v,
            self.constructFromPrePost(preorder[1:mid_i + 2], postorder[:mid_i + 1]),
            self.constructFromPrePost(preorder[mid_i + 2:], postorder[mid_i + 1:-1]),
        )
        return root