class _DoubleLinkedBase:
    class _Node:
        __slots__ = '_element', '_prev', '_next'

        def __init__(self, element, prev, next):
            self._element = element
            self._prev = prev
            self._next = next

    def __init__(self):
        self._header = self._Node(None, None, None)
        self._tailer = self._Node(None, None, None)
        self._header._next = self.tailer
        self._tailer._prev = self.header
        self._size = 0

    def insert_between(self, e, prev, next):
        node = self._Node(e, prev, next)
        prev._next = node
        next._prev = node
        self._size += 1
        return node

    def delete(self, node):
        node._prev._next = node._next
        node._next._prev = node._prev
        self._size -= 1
        return node._element
    

# Given a position in the list, you can access the elements at O(1)
class PositionalList(_DoubleLinkedBase):
    class Position:
        def __init__(self):