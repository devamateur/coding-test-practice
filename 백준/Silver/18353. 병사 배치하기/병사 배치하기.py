class Solution:

    def deploy(self):
        N = int(input())

        power = list(map(int, input().split()))
        dp = [1] * N

        for i in range(N-2, -1, -1):
            for j in range(N-1, i-1, -1):     # j: i의 뒤에 있는 원소들
                if power[j] < power[i]:
                    dp[i] = max(dp[i], dp[j]+1)
        print(N-max(dp))

s = Solution()
s.deploy()