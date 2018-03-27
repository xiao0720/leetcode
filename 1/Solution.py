class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            try:
                j = nums.index(target - nums[i])
            except:
                j = -1
            if (j > -1) and (j != i): 
                return [i, j] if i < j else [j, i]

if __name__ == "__main__":
    print(Solution().twoSum([2, 2, 11, 15], 4))