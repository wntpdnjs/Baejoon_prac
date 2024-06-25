num_list = []
for i in range(10):
  a = int(input())
  num = a%42
  if num not in num_list :
    num_list.append(num)

print(len(num_list))
