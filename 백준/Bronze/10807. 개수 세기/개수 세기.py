a = int(input())
num = list(map(int, input().split()))
b= int(input())
count =0
for i in num:
  if i == b :
    count +=1

print (count)
