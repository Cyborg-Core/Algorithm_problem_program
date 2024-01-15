# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head
        stack = [head]
        record = head.next
        stack[-1].next = None
        flag = False
        while record:
            if record.val == stack[-1].val:
                flag = True
            else:
                if flag:
                    stack.pop()
                stack.append(record)
                flag = False
            record = record.next
            stack[-1].next = None
        if flag:
            stack.pop()
        if stack:
            head = stack[0]
            record = head
            for n in stack[1:]:
                record.next = n
                record = record.next
            return head
        else:
            return None
