class Solution:
    def dfs(self, root: TreeNode):
        if not root:
            return
        self.dfs(root.left)
        self.query_list.append(root.val)
        self.dfs(root.right)

    def find(self, query) -> List[int]:
        begin = 0
        end = len(self.query_list)
        mid = (begin + end) // 2
        while end - begin > 1:
            if self.query_list[mid] == query:
                return [query, query]
            elif self.query_list[mid] > query:
                end = mid
            else:
                begin = mid

            mid = (begin + end) // 2
            # print(begin,end,mid)
        return [self.query_list[begin], -1 if self.query_list[end] == 1e7 else self.query_list[end]]

    def closestNodes(self, root: Optional[TreeNode], queries: List[int]) -> List[List[int]]:
        self.query_list = []
        self.dfs(root)
        self.query_list = [-1] + self.query_list + [1e7]
        return [self.find(q) for q in queries]
