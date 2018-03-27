class Solution(object):
    def twoSum(self, nums, target):
        lookup = {}
        for i, num in enumerate(nums):
            if target - num in lookup:
                return [lookup[target - num], i]
            lookup[num] = i

if __name__ == "__main__":
    print(Solution().twoSum([2, 2, 11, 15], 4))