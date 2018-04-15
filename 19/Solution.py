class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        count = 0
        node = head

        while node is not None:
            count += 1
            node = node.next
            
        if count - n == 0:
            return head.next

        prev = count - n - 1      
        node = head

        while prev > 0:
            node = node.next
            prev -= 1

        node.next = node.next.next

        return head


        
        