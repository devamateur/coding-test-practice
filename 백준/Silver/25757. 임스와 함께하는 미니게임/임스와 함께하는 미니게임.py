N, G = input().split()

people = {}
for _ in range(int(N)):
    names = input()
    if names not in people:
        people[names] = 1
    else:
        people[names] += 1
    
if G == 'Y':
    print(len(people.keys()))
elif G == 'F':
    print(len(people.keys())//2)
else:
    print(len(people.keys())//3)
