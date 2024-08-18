class Solution:
    def find(self):
        N = int(input())

        dp = []

        for i in range(N):
            line = list(map(int, input().split()))

            dp.append(line)
        #print(dp)

        for i in range(1, N):
            for j in range(0, i+1):
                if j-1 < 0:
                    dp[i][j] = dp[i-1][j]+dp[i][j]
                
                else:
                    if j+1 > i:
                        dp[i][j] = dp[i-1][j-1]+dp[i][j]
                    else:
                        dp[i][j] = max(dp[i-1][j]+dp[i][j], dp[i-1][j-1]+dp[i][j])

        print(max(dp[N-1]))
s = Solution()
s.find()