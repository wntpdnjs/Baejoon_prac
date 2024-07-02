a, b = map(int, input().split())
bascket = [i+1 for i in range(a)]
team = 0
for x in range(b):
  i,j = map(int, input().split())
  temp = bascket[i-1:j]
  temp.reverse()
  bascket[i-1:j] = temp

for i in bascket :
  print(i , end= " ")