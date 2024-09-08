data = list(map(int, input().split()))

num = [1,1,2,2,2,8]

for i in range(6):
    data[i] = num[i]-data[i]
    print(data[i] , end=" ")


