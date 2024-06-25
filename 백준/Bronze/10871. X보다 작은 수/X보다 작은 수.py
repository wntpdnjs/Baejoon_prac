a, b = map(int, input().split())
num = list(map(int, input().split()))
small_num = []
for i in num:
  if i < b:
    small_num.append (i)
for i in small_num:
  print(i, end=" ")