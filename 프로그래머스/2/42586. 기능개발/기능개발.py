def solution(progresses, speeds):
    answer = []

    days = []
    
    for i in range(len(progresses)):
        if (100-progresses[i])%speeds[i] == 0:
            days.append((100-progresses[i])//speeds[i])
        else:         # 남은 진도가 나누어떨어지지 않으면 +1
            days.append((100-progresses[i])//speeds[i]+1)

    # 큐
    while len(days) > 0:
        task_count = 1
        front = days.pop(0)
        
        while(len(days) > 0 and days[0] <= front):
            task_count += 1
            days.pop(0)
        answer.append(task_count)
    return answer