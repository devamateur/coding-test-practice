from collections import defaultdict

words = input()

word_dict = defaultdict(int)

for w in words:
    word_dict[w.upper()] += 1

word_dict = dict(sorted(word_dict.items(), key=lambda x:x[1], reverse=True))

if len(word_dict) >= 2 and list(word_dict.values())[0] == list(word_dict.values())[1]:
    print("?")
else:
    print(list(word_dict.keys())[0])