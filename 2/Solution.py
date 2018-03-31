from ListNode import *


class Solution():
    def addTwoNumbers(self, l1, l2):
        current_node = ListNode(None)
        head_node = current_node
        carry = 0
        p = l1
        q = l2

        while p is not None or q is not None or carry != 0:
            x = p.val if p is not None else 0
            y = q.val if q is not None else 0

            sum = x + y + carry
            sum, carry = sum % 10, int(sum / 10)

            current_node.next = ListNode(sum)

            current_node = current_node.next

            if p is not None:
                p = p.next
            if q is not None:
                q = q.next

        return head_node.next


def buildTree(nums):
    node = ListNode(nums[0])
    node.next = ListNode(nums[1])
    node.next.next = ListNode(nums[2])
    return node


def printTree(node):
    print(node.val, "->", node.next.val, "->", node.next.next.val, sep=" ")


if __name__ == "__main__":
    nums1 = [2, 4, 3]
    nums2 = [5, 6, 4]
    print(
        printTree(Solution().addTwoNumbers(buildTree(nums1),
                                           buildTree(nums2))))
