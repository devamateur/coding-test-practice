N = int(input())

layer = 1
houses = 1

while houses < N:
    houses += 6*layer
    layer += 1

print(layer)