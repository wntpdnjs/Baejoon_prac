a,b = input().split()
a=int(a)
b=int(b)
arr=[]
arr1=[]


for i in range(a):
	arr.append(list(map(int, input().split())))
for i in range(a):
	arr1.append(list(map(int, input().split())))
for i in range(a):
    for j in range(b) :
        arr2 = arr[i][j]+arr1[i][j]
        print(arr2,end=' ')
    print()

