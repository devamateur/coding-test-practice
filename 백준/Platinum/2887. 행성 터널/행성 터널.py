import sys
input = sys.stdin.readline

class Solution:
    def connect(self):
        def find_parent(p, node):
            if p[node] != node:
                p[node] = find_parent(p, p[node])
            return p[node]
        
        def union(p, a, b):
            a = find_parent(p, a)
            b = find_parent(p, b)

            if a < b:
                p[b] = a
            else:
                p[a] = b

        N = int(input())
        parent = [i for i in range(N)]

        x_loc = []
        y_loc = []
        z_loc = []

        for i in range(N):
            x, y, z = map(int, input().split())
            x_loc.append((x, i))
            y_loc.append((y, i))
            z_loc.append((z, i))

        x_loc.sort()
        y_loc.sort()
        z_loc.sort()

        graph = []
        for i in range(N-1):
            graph.append((x_loc[i+1][0] - x_loc[i][0], x_loc[i][1], x_loc[i+1][1]))
            graph.append((y_loc[i+1][0] - y_loc[i][0], y_loc[i][1], y_loc[i+1][1]))
            graph.append((z_loc[i+1][0] - z_loc[i][0], z_loc[i][1], z_loc[i+1][1]))

        graph.sort()

        result = 0
        for cost, a, b in graph:
            if find_parent(parent, a) != find_parent(parent, b):
                union(parent, a, b)
                result += cost

        print(result)

s = Solution()
s.connect()