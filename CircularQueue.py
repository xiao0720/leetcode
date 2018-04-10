class CircularQueue:
    class _Node:
        __slots__ = '_element', '_next'

        def __init__(self, element):
            self._element = element
            self._next = next

    def __init__(self):
        self._tail = None
        self._size = 0

    def __len__(self):
        return self._size

    def is_empty(self):
        return self._size == 0

    def enqueue(self, e):
        node = self._Node(e)
        if self.is_empty():
            self._tail = node
        else:
            node._next = self._tail._next
        self._tail._next = node
        self._size += 1

    def dequeue(self):
        if self.is_empty():
            return None
        node = self._tail._next

        if node._next == node:
            self._tail = None
        else:
            self._tail._next = node._next
        
        self._size -= 1
        return node._element

    def rotate(self):
        if self.is_empty():
            return None
        else:
            self._tail = self._tail._next
