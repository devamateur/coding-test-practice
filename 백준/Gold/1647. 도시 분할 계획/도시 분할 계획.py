import sys
input = sys.stdin.readline                       #### 입력

class Solution:
    def divide(self):

        N, M = map(int, input().split())
        graph = []
        parent = [i for i in range(N+1)]

        for _ in range(M):
            # a: 집1, b: 집2, c: 유지비(cost)
            a, b, c = map(int, input().split())
            graph.append((c, a, b))         # cost 순으로 정렬해야 하므로 cost를 앞에 저장

        # 유지비 기준 오름차순 정렬
        graph.sort()
        
        def find_parent(p: list, a):
            if p[a] != a:
                p[a] = find_parent(p, p[a])        #### 경로 압축, 루트를 현재 노드의 부모로 설정 설정
            return p[a]
        
        def union(p: list, a, b):
            a_p = find_parent(p, a)
            b_p = find_parent(p, b)

            if a_p < b_p:
                p[b_p] = a_p
            else:
                p[a_p] = b_p

            return p

        result = 0
        last = 0
        for i in range(len(graph)):
            if find_parent(parent, graph[i][1]) != find_parent(parent, graph[i][2]):
                parent = union(parent, graph[i][1], graph[i][2])

                result += graph[i][0]
                last = graph[i][0]
        
        print(result - last)
        
s = Solution()
s.divide()