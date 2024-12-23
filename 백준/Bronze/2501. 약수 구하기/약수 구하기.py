a, b  = map(int, input().split())
divide=[]
for i in range (1,a+1) :
    if a % i ==0 :
        divide.append(i)
if b<=len(divide):
    print (divide[b-1])
else :
    print ('0')
        

