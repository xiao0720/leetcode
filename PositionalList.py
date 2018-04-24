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
        self._header._next = self._tailer
        self._tailer._prev = self._header
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
    

class PositionalList(_DoubleLinkedBase):
    class Position:
        def __init__(self, container, node):
            self._container = container
            self._node = node

        def element(self):
            return self._node._element

        def __eq__(self, other):
            return type(other) is type(self) and other._node is self._node

        def __ne__(self, other):
            return not (self == other)

    def _make_position(self, p):
        return self.Position(self, p)