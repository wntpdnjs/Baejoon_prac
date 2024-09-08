word = input()
for i in range(len(word)):
    if word[i] == word[-i-1]:
        pass
    else :
        print(0)
        exit(0)
print(1)