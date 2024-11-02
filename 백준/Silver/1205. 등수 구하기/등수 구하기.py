N, new_score, P = map(int, input().split())

if N == 0:
    print(1)
else:
    score_list = list(map(int, input().split()))

    score_list.append(new_score)
    score_list.sort(reverse=True)

    rank = score_list.index(new_score) + 1 

    if rank > P or (N == P and new_score <= score_list[-1]):
        print(-1)
    else:
        print(rank)
