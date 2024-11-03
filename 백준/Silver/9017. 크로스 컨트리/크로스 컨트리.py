from collections import defaultdict

T = int(input())

for _ in range(T):
    N = int(input())
    
    team = list(map(int, input().split()))
    team_count = list(set(team))

    for t in team_count:
        if team.count(t) < 6:          # 6명 미만인 팀은 삭제
            while t in team:
                team.remove(t)
    
    score_dict = defaultdict(int)        # 각 팀의 점수 저장
    count_dict = defaultdict(int)        # 팀의 4명을 카운트하는 딕셔너리

    for i in range(len(team)):
        if count_dict[team[i]] == 4:
            continue
        score_dict[team[i]] += i+1
        count_dict[team[i]] += 1
    
    # 점수 오름차순 정렬
    scores = sorted(score_dict.items(), key=lambda x: x[1])
    min_score = scores[0][1]
    count_dict = defaultdict(int)

    breaker = False
    # 두 팀의 점수가 같으면
    if len(scores) >= 2 and scores[0][1] == scores[1][1]:
        for i in range(len(team)):
            count_dict[team[i]] += 1

            for j in range(len(scores)):
                if count_dict[team[i]] == 5 and scores[j][0] == team[i] and scores[j][1] == min_score:       # 5번째 선수가 먼저 들어온 팀이 우승
                    print(team[i])
                    breaker = True
            if breaker:
                break
    else:         # 두 팀의 점수가 다르면, 점수가 가장 적은 팀이 우승
        print(scores[0][0])