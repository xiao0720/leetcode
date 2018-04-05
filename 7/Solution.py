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

        digit_lst = []
        self.digits(x, digit_lst)
        num = self.getInt(digit_lst)
        return -num if is_negative else num

    def digits(self, x, digit_lst):
        if x != 0:
            digit_lst.append(x % 10)
            self.digits(x // 10, digit_lst)

    def getInt(self, lst):
        res = 0
        pow = len(lst) - 1

        for el in lst:
            res += el * (10 ** pow)
            pow -= 1

        return res

        
if __name__ == '__main__':
    print(Solution().reverse(-123))