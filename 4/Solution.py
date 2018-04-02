class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums1.extend(nums2)
        merged = sorted(nums1)

        length = len(merged)
        if length % 2 != 0:
            return merged[int(length/2)]
        else:
            return (merged[int(length/2) - 1] + merged[int(length/2)])/2

if __name__ == '__main__':
    nums1 = [1, 2, 3]
    nums2 = [3, 4, 5]
    print(Solution().findMedianSortedArrays(nums1, nums2))