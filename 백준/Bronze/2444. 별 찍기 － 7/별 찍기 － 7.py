num = int(input())
for i in range(num):
    print ((num-(i+1))*" " + (2*(i+1)-1)*'*')
for i in range(num-1,-1,-1):
    print ((num-(i))*" " + (2*(i)-1)*'*')
