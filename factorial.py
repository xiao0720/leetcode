def factor(n):
    if n == 0:
        return 1
    else:
        return n * factor(n - 1)
    

if __name__ == '__main__':
    print(factor(4))