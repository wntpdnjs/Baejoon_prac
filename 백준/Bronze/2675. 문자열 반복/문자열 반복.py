a = int(input ())
for i in range (a) :
    num, word = input().split()
    for j in word :
        print (int(num)*j, end="")
    print()
