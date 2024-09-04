class Solution:
    def install(self):
        N = int(input())

        loc = list(map(int, input().split()))

        loc.sort()

        print(loc[(N-1)//2])

s = Solution()
s.install()