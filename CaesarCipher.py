class CaesarCipher:
    def encrypt(self, plain, n):
        rst = [None] * len(plain)

        for i in range(len(plain)):
            rst[i] = chr((ord(plain[i]) - ord('A') + n) % 26 + ord('A'))
        
        return ''.join(rst)

    def decrypt(self, encrypted, n):
        rst = [None] * len(encrypted)

        for i in range(len(encrypted)):
            rst[i] = chr((ord(encrypted[i]) - ord('A') - n) % 26 + ord('A'))
        
        return ''.join(rst)


if __name__ == '__main__':
    print(CaesarCipher().encrypt('APPLE', 5))
    print(CaesarCipher().decrypt('FUUQJ', 5))