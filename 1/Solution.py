class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            j = target - nums[i]
            if (j in nums) and (nums.index(j) != i): 
                return sorted([i, nums.index(j)])

if __name__ == "__main__":
    print(Solution().twoSum([2, 2, 11, 15], 4))