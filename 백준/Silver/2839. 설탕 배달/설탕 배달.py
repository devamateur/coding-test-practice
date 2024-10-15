N = int(input())

result = 0
if N==4 or N==7:
    result = -1
elif N%5 == 0:
    result = N//5
elif (N%5 == 1) or (N%5 == 3):
    result = N//5 + 1
elif (N%5 == 2) or (N%5 == 4):
    result = N//5 + 2

if result == 0:
    result = -1

print(result)