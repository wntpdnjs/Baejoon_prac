a = int(input())

c = int(input())

hundred_c = c//100
ten_c = (c-(100*hundred_c))//10
one_c = (c-(100*hundred_c))%10
print(a*one_c)
print(a*ten_c)
print(a*hundred_c)
print(a*c)


