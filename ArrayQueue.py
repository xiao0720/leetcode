class ArrayQueue:
    def __init__(self, max=10):
        self._data = [None] * max
        self._size = 0
        self._front = 0
        self._max = max

    def enqueue(self, e):
        self._data[(self._front + self._size) % self._max] = e
        self._size += 1

    def dequeue(self):
        rst, self._data[self._front] = self._data[self._front], None
        self._front = (self._front + 1) % self._max
        self._size -= 1
        return rst

    def __len__(self):
        return self._size