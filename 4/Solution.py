class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        counter = 0
        p = 0
        q = 0
        
        m1 = -1
        m2 = -1

        len_sum = len(nums1) + len(nums2)

        if len_sum % 2 == 0:
            n = len_sum/2 - 1
            m = n + 1
        else:
            n = int(len_sum/2)
            m = None

        max = m if m else n
        
        while counter <= max:
            counter += 1

            if p == len(nums1):
                m1, m2 = m2, nums2[q]
                q += 1
                continue

            if q == len(nums2):
                m1, m2 = m2, nums1[p]
                p += 1
                continue

            if nums1[p] <= nums2[q]:
                m1, m2 = m2, nums1[p]
                p += 1
            else:
                m1, m2 = m2, nums2[q]
                q += 1

        return (m1 + m2)/2 if m else m2


if __name__ == '__main__':
