def find_min(nums)
    first = 0
    last = nums.length - 1

    while first + 1 < last
        mid = first + (last - first)/2
        puts nums[mid]
        if nums.first <= nums[mid]
            first = mid
        else
            last = mid
        end
    end

    return nums[first] if nums[first] <= nums[last]
    return nums[last] if nums[last] < nums[first]
end
