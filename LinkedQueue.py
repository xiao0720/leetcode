class LinkedQueue:
    class _Node:

        __slots__ = '_element', '_next'

        def __init__(self, element):
            self._element = element
            self._next = next

    def __init__(self):
        self._head = None
        self._tail = None
        self._size = 0

    def __len__(self):
        return self._size

    def enqueue(self, e):
        node = self._Node(e)
        if self._size == 0:
            self._head = node
        else:
            self._tail._next = node
        self._tail = node
        self._size += 1

    def dequeue(self):
        node = self._head
        self._head = self._head._next
        if self._size == 0: self._tail = None
        self._size -= 1
        return node._element


            
        
        