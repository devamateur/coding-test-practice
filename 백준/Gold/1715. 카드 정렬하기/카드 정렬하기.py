import heapq
class Solution:
    def card_sorting(self):
        N = int(input())

        cards = []

        for _ in range(N):
            cards.append(int(input()))
        
        cards.sort()

        q = []

        for i in range(len(cards)):
            heapq.heappush(q, cards[i])    

        result = 0
        while len(q) >= 2:
            a = heapq.heappop(q)
            b = heapq.heappop(q)
            sum_ = a + b
            heapq.heappush(q, sum_)
            result += sum_
        print(result)
s = Solution()
s.card_sorting()