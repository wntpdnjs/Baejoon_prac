
while True :
    divide = []
    plus =0
    
    a = int(input())
    if a == -1 :
        break
    else : 
        for i in range (1,a):
            if a%i ==0:
                divide.append (i)
        for j in divide :
            plus += j
        if plus == a :
            print(f"{a} = ", end = "")
            print(*divide, sep = " + ")

        else :
            print(f"{a} is NOT perfect.") 

        
