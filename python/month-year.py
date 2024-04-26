a = int(input("Enter month in number 1-12 :"))
b = int(input("Enter year :"))
if((a==2 and b % 400 == 0) or (b%100 != 0) and (b%4 == 0)):
    print("29 days and leap year")
elif((a == 1 or  a== 3 or  a == 5 or a == 7 or  a== 8 or a == 10 or a== 12 and b % 400 == 0) 
     or (b%100 != 0) and (b%4 == 0)):
    print("Entered month has 31 days and leap year")
elif(( a ==4, a ==6, a ==9, a ==11 and b % 400 == 0) or (b%100 != 0) and (b%4 == 0)):
        print("30 days")  
elif(a==2):
    print("28 days")
elif(a == 1, a ==3, a ==5, a ==8, a ==7, a ==10, a ==12):
    print("31 day")
elif( a ==4, a ==6, a ==9, a ==11):
    print("30 days")