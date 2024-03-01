def solution(clothes):
    answer = 1
    
    item_dict = {}
    for i in range(len(clothes)):
        if clothes[i][1] not in item_dict:
            item_dict[clothes[i][1]] = 1
        else:
            item_dict[clothes[i][1]] += 1
    
    for item, amount in item_dict.items():
        answer *= amount+1       # 아이템 종류별로 안 입는 경우
    
    return answer-1         # 모든 아이템을 안 입는 경우를 제외