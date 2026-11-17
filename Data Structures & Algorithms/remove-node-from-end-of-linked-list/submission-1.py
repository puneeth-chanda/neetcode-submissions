# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = head
        fast = head

        if(head== None or head.next == None):
            return None

        while(n>0):
            fast = fast.next
            n-=1

        if(fast==None):
            return head.next
        while(fast!=None):
            prev = slow
            slow = slow.next
            fast = fast.next

        temp = slow.next
        prev.next = temp

        return head
        