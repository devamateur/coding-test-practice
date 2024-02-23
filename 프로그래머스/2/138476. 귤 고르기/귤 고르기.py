def solution(k, tangerine):
    answer = 0
    
    count_dict = {}        # 크기별 귤의 개수를 저장하는 딕셔너리
    
    for item in tangerine:
        if item not in count_dict:
            count_dict[item] = 1
        else:
            count_dict[item] += 1
            
    count_dict = dict(sorted(count_dict.items(), key=lambda x: x[1], reverse=True))

    box = []      # 중복인 귤 중 k개를 담는 리스트
    for t, c in count_dict.items():
        if len(box) < k:
            for i in range(c):
                box.append(t)
    answer = len(set(box))
    
    return answer