from collections import deque
class Solution:
    def visit(self):
        # N: 도시의 개수, M: 도로의 개수, K: 거리 정보, X: 출발 도시의 번호
        N, M, K, X = map(int, input().split())
        
        edges = [[] for _ in range(N+1)]
        distance = [-1]*(N+1)
        distance[X] = 0
        
        for _ in range(M):
            a, b = map(int, input().split())
            edges[a].append(b)
        
        q = deque([X])
        
        while q:
            node = q.popleft()

            for next_node in edges[node]:
                if distance[next_node] == -1:
                    distance[next_node] = distance[node] + 1
                    q.append(next_node)

        if K in distance:
            for i in range(1, N+1):
                if distance[i] == K:
                    print(i)
        else:
            print(-1)


s = Solution()
s.visit()