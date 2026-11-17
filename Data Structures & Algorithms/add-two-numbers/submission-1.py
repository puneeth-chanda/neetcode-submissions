# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        num1 = 0
        mul = 1
        while l1 is not None:
            num1 = num1 + (l1.val * mul)
            l1 = l1.next
            mul = mul*10

        num2 = 0
        mul = 1
        while l2 is not None:
            num2 = num2 + (l2.val * mul)
            l2 = l2.next
            mul = mul*10

        sum = num1+num2
        dummy = ListNode(0,None)
        if(sum == 0 ):
            return dummy
        temp = dummy
        while(sum > 0):
            temp.next = ListNode(sum%10,None)
            temp = temp.next
            sum = sum // 10

        return dummy.next