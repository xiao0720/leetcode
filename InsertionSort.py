class InsertionSort:
    @staticmethod
    def sort(lst):
        for i in range(1, len(lst)):
            j = i - 1
            while j >= 0 and lst[j] > lst[j+1]:
                lst[j], lst[j+1] = lst[j+1], lst[j]
                j -= 1
        return lst
            

if __name__ == '__main__':
    lst = [1,4,3,6,5,1]
    print(InsertionSort.sort(lst))