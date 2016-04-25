# Problem: # 217 Contains Duplicate
# Idea: find wether there is a difference in size between the uniq arry and original array
# Solutions: use .uniq.size()

# @param {Integer[]} nums
# @return {Boolean}
def contains_duplicate(nums)
    return nums.uniq.size() != nums.size()
end
