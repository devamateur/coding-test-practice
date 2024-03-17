def solution(k, dungeons):
    global answer 
    answer = -1
    
    global visited 
    visited = [False]*len(dungeons)
    
    answer = dfs(dungeons, 0, k, 0)
    
    return answer

def dfs(dungeons, num, k, count) -> int:
    global answer
    answer = max(answer, count)
    
    for i in range(len(dungeons)):
        if not visited[i] and dungeons[i][0] <= k:
            visited[i] = True
            dfs(dungeons, i+1, k-dungeons[i][1], count+1)
            visited[i] = False
    return answer