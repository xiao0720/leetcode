class Solution:
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        left = '([{'
        right = ')]}'
        stack = Stack(len(s))

        for i in s:
            if i in left:
                stack.push(i)
            elif i in right:
                if len(stack) > 0:
                    if stack.pop() != left[right.index(i)]: return False
                else:
                    return False

        return len(stack) == 0


class Stack:
    def __init__(self, n):
        self._data = [None] * n
        self._n = 0

    def push(self, e):
        self._data[self._n] = e
        self._n += 1

    def pop(self):
        rst = self._data[self._n - 1]
        self._n -= 1
        return rst

    def __len__(self):
        return self._n


if __name__ == '__main__':
    s = '()'
    print(Solution().isValid(s))