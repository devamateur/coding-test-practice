from itertools import combinations, permutations

def combi(n, r):
    if n == r or r == 0:
        return 1
    else:
        return combi(n-1, r-1) + combi(n-1, r)

def solution(clothes):
    answer = 1
    
    item_dict = {}
    for i in range(len(clothes)):
        if clothes[i][1] not in item_dict:
            item_dict[clothes[i][1]] = 1
        else:
            item_dict[clothes[i][1]] += 1
    
    for item, amount in item_dict.items():
        answer *= combi(amount, 1) + combi(amount, 0)
    
    return answer-1