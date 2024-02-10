def solution(n, words):

    # 이전에 등장한 단어 사용 불가 (중복 판단)
    # 한 글자 사용 불가
    lose_round= 0
    loser = 0
    
    for i in range(1, len(words)):
        truncated_words = words[:i]
        if words[i][0] != words[i-1][-1] or words[i] in truncated_words:
            loser = i%n+1
            lose_round = i//n+1
            break
            
    return [loser, lose_round]