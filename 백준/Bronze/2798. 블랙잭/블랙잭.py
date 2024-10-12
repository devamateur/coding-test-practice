class Solution:
    def blackjack(self):
        N, M = map(int, input().split())
    
        cards = list(map(int, input().split()))
    
        max_nums = 0
        for i in range(N):
            for j in range(N):
                for k in range(N):
                    if i == j or j == k or i == k: continue
                    curr_sum = cards[i]+cards[j]+cards[k]
                    if curr_sum <= M and curr_sum > max_nums:
                        max_nums = curr_sum
        print(max_nums)
    
s = Solution()
s.blackjack()