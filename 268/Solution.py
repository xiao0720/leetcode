class Solution:
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dic = dict()
        for num in nums:
            dic[num] = 1

        i = 0

        for i in range(len(nums)):
            if dic.get(i) is None:
                return i

        return i + 1
