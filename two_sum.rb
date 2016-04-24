# Problem: #1 Two Sum
# Author: xiao0720
# Idea: iterate through each number in the nums, compare the difference between target
# and the current number, find if the difference exists as an item in the rest of the
# array nums.

def two_sum(nums, target)
  nums.each_with_index do |num, i|
    j = nums.rindex(target - num)
    return [i, j] if i != j && !j.nil?
  end
end

