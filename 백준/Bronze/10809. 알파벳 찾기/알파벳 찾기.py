word = input()
for i in range (97,123) :
    a = chr(i)
    if a in word:
        print(word.index(a) ,end=" ")
    else :
        print (-1, end=" ")
