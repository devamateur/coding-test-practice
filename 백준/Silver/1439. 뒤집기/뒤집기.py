class Solution:
    def reverse(self):
        s = input()

        zeros = 0
        ones = 0
        zeros_result = 0
        ones_result = 0

        for i in range(len(s)):
            if s[i] == '1':
                if zeros > 0:
                    zeros_result += 1
                    zeros = 0
                ones += 1
            else:
                if ones > 0:
                    ones_result += 1
                    ones = 0
                zeros += 1
        print(max(zeros_result, ones_result))

s = Solution()
s.reverse()