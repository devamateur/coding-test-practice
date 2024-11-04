from collections import defaultdict

N, M = map(int, input().split())

words = []

for _ in range(N):
    words.append(input())
word_dict = defaultdict(int)       # 단어의 빈도를 저장하는 딕셔너리

for w in words:
    if len(w) >= M:          # 단어 길이가 M이상이면 딕셔너리에 저장
        word_dict[w] += 1

# 딕셔너리 정렬
word_dict = dict(sorted(word_dict.items(), key=lambda x: (-x[1], -len(x[0]), x[0])))

for key, val in word_dict.items():
    print(key)