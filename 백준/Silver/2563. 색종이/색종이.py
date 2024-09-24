array = [[0 for col in range(100)] for row in range(100)]

input_num = int(input())

for i in range(input_num):
        a,b=input().split()
        a=int(a)
        b=int(b)
        for j in range(a,a+10) :
                for z in range(b,b+10):
                        array[j][z] = 1
                        
count = sum(row.count(1) for row in array)

print(count)
         
