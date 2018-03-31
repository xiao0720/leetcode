class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        used_chars = {}
        current = 0
        maximum = 0
        for counter, value in enumerate(s):
            if value in used_chars:
                current = max(used_chars[value] + 1, current)
            used_chars[value] = counter
            maximum = max(counter - current + 1, maximum)
        return maximum

if __name__ == '__main__':
    s = "tmmzuxt"
    print(Solution().lengthOfLongestSubstring(s))