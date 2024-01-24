# Definition for singly-linked list.
from math import gcd
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        begin = head
        end = head.next
        while begin and end:
            insert_node = ListNode(gcd(begin.val, end.val))
            begin.next = insert_node
            insert_node.next = end
            begin = end
            end = end.next
        return head
