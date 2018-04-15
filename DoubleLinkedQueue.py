class _DoubleLinkedList:
    class _Node:
        __slots__ = '_element', '_prev', '_next'

        def __init__(self, element, prev, next):
            self._element = element
            self._prev = prev
            self._next = next

    def __init__(self):
        self.header = self._Node(None, None, None)
        self.tailer = self._Node(None, None, None)
        self.header._next = self.tailer
        self.tailer._prev = self.header
        self._size = 0

    def __len__(self):
        return self._size

    def is_empty(self):
        return self._size == 0

    def insert_between(self, e, prev, next):
        node = self._Node(e, prev, next)
        prev._next = node
        next._prev = node
        self._size += 1
        return node

    def delete_node(self, node):
        node._prev._next = node._next
        node._next._prev = node._prev
        self._size -= 1
        e = node._element
        node._prev = node._next = node._element = None
        return e

class DoubleLinedQueue(_DoubleLinkedList):
    def first(self):
        if self.is_empty():
            return None
        else:
            return self.header._next
    
    def last(self):
        if self.is_empty():
            return None
        else:
            return self.tailer._prev

    def insert_first(self, e):
        self.insert_between(e, self.header, self.header._next)

    def insert_last(self, e):
        self.insert_between(e, self.tailer._prev, self.tailer)

    def delete_first(self):
        if self.is_empty():
            return None
        else:
            return self.delete_node(self.header._next)

    def delete_last(self):
        if self.is_empty():
            return None
        else:
            return self.delete_node(self.tailer._prev)
