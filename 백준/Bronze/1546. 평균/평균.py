a = int(input())
num_list = []
num_list = list(map(int, input().split()))
  

high_score = max(num_list)

for i in range(len(num_list)):

      num_list[i] = num_list[i]/high_score*100

print(sum(num_list)/a)




