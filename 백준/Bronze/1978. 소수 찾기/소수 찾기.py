a = int (input())
d_array = list(map(int,input().split()))
ans =0
for i in d_array :

    num =0
    for j in range (1,i+1) :
        if i%j == 0 :
            num +=1
    if num == 2 :
        ans +=1
    else :
        pass
print(ans)
