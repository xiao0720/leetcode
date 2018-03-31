from ListNode import *


class Solution():
    def addTwoNumbers(self, l1, l2):
        head_node = current_node = ListNode(None)
        carry = 0
        p = l1
        q = l2

        while p or q or carry:
            x = y = 0

            if p is not None:
                x = p.val
                p = p.next

            if q is not None:
                y = q.val
                q = q.next

            sum = x + y + carry
            sum, carry = sum % 10, int(sum / 10)

            current_node.next = ListNode(sum)
            current_node = current_node.next

        return head_node.next


def buildTree(nums):
    head = node = ListNode(None)
    for num in nums:
        node.next = ListNode(num)
        node = node.next
    return head.next


def printTree(node):
    while node:
        print(node.val, end='')
        node = node.next
        if node: print(' -> ', end='')
    print()


if __name__ == '__main__':
    nums1 = [2, 4]
    nums2 = [2, 5, 9]
    printTree(Solution().addTwoNumbers(buildTree(nums1),
                                        buildTree(nums2)))
