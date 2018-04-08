class Stack:
    def __init__(self):
        self._memory = []

    def push(self, e):
        self._memory.append(e)

    def pop(self):
        return self._memory.pop()

    def top(self):
        return self._memory[-1]

    def is_empty(self):
        return len(self._memory) == 0

    def __len__(self):
        return len(self._memory)