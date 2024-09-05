import collections
def solution(N, stages):
    answer = []
    
    # 실패율 = 스테이지에 도달했지만 클리어못한 플레이어 수 / 스테이지에 도달한 전체 플레이어 수
    stages.sort()
    
    for i in range(1, N+1):
        current_player = stages.count(i)
        total_player = 0
        
        if current_player == 0:        # 분자
            fail_rate = 0
            
        for j in range(len(stages)):
            if stages[j] >= i:
                total_player += 1
            
        if total_player == 0:          # 분모
            fail_rate = 0
        else:
            fail_rate = current_player / total_player
        answer.append((i, fail_rate))
    answer.sort(key=lambda x:x[1], reverse=True)
    
    return [a[0] for a in answer]