from collections import deque
N = int(input())

q = deque(list(range(1, N+1)))

while len(q) >= 2:
    discarded = q.popleft()
    changed = q.popleft()
    
    q.append(changed)
print(q[0])