class ArrayDequeue:
    def __init__(self, max=10):
        self._data = [None] * max
        self._front = 0
        self._size = 0

    def add_first(self, e):
        self._front = (self._front - 1 ) % len(self._data)
        self._data[self._front] = e
        self._size += 1

    def add_last(self, e):
        self._data[(self._front + self._size) % len(self._data)] = e
        self._size += 1

    def pop_first(self):
        rst, self._data[self._front] = self._data[self._front], None
        self._front = (self._front + 1) % len(self._data)
        self._size -= 1
        return rst

    def pop_last(self):
        rst, self._data[(self._front + self._size - 1) % len(self._data)] = self._data[(self._front + self._size - 1) % len(self._data)], None
        self._size -= 1
        return rst
