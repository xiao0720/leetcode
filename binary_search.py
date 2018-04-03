def bs(data, target, low, high):
    if low > high:
        return False
    else:
        mid = (low + high)//2
        if target == data[mid]:
            return True
        elif target < data[mid]:
            return bs(data, target, low, mid - 1)
        else:
            return bs(data, target, mid + 1, high)

if __name__ == '__main__':
    nums = [1,2,3,4,5,6,7,8]
    print(bs(nums, 9, 0, len(nums) - 1))
