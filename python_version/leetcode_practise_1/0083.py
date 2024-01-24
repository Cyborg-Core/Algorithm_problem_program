from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        s = head
        end = head.next
        while end:
            if s.val == end.val:
                s.next = end.next
                end.next = None
                end = s.next
            else:
                s = end
                end = s.next
        return head
