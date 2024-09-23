arr = []


for i in range(9):
    arr.append(list(map(int, input().split())))


max_num = arr[0][0]
a = 1
b = 1


for i in range(9):
    for j in range(9):
        if max_num < arr[i][j]:
            max_num = arr[i][j]
            a = i + 1
            b = j + 1

print(max_num)
print(a, b, end=" ")
