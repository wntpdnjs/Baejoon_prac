a = int(input())
quater =0
dime =0
nickel =0
penny =0


for i in range(a):
        b=int(input())
        quater = b//25
        b = b-25*quater
        dime = b // 10
        b = b-10*dime
        nickel = b //5
        b = b-5*nickel
        penny = b // 1

        print("%d %d %d %d" %(quater  ,dime ,nickel ,penny))
