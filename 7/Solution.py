class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        is_negative = False
        if x < 0:
            is_negative = True
            x = -x

        self.digits(x)
        num = self.getInt(self.digits(x))
        return -num if is_negative else num

    def digits(self, x):
        digit_lst = []

        while x != 0:
            digit_lst.append(x % 10)
            x = x // 10

        return digit_lst

    def getInt(self, lst):
        res = 0
        pow = len(lst) - 1

        for el in lst:
            res += el * (10 ** pow)
            pow -= 1

        return res

        
if __name__ == '__main__':
    print(Solution().reverse(12243))