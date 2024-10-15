while True:
    a, b, c = map(int, input().split())
    if a == 0 and b == 0 and c == 0:
        break
    new_list = [a, b, c]
    new_list.sort()
    
    if a == b == c:
        print("Equilateral")
    elif a == b or b == c or a == c:
        if new_list[2] >= new_list[0] + new_list[1]:
            print("Invalid")
        else:
            print("Isosceles")
    elif a != b and b != c:
        if new_list[2] >= new_list[0] + new_list[1]:
            print("Invalid")
        else:
            print("Scalene")