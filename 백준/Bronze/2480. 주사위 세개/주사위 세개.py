a, b, c = map(int, input().split())

if a==b and b==c :
  money = 10000+a*1000
elif a==b and  b!=c :
  money = 1000 + a*100
elif a!=b and b==c :
  money = 1000 + b*100
elif a!=b and a==c :
  money = 1000 + a*100
elif a==c and  b!=c :
  money = 1000 + a*100
elif a!=c and  b==c :
  money = 1000 + a*100
elif a!=c and  b==a :
  money = 1000 + a*100
else : 
  money = 100 * max (a,b,c)
print (money)

