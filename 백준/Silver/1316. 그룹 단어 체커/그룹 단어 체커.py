a = int(input())
ans = a
for i in range (a):
    word = input()
  
    for j in range(len(word)-1) :
    
        if word[j] == word[j+1] :
            pass
        #print(cnt)
        elif word[j] in word[j+1:]:
            ans -=1
            break
print(ans)
