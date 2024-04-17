a = int(input("Enter month in number 1-12 :"))
b = int(input("Enter year :"))
if((a==2 and b % 400 == 0) or (b%100 != 0) and (b%4 == 0)):
    print("29 days and leap year")
elif(a==2):
    print("28 days and its not leap year")
elif(a == 1, a ==3, a ==5, a ==8, a ==7, a ==10, a ==12):
    print("31 day and not an leap year")
elif(a== 2, a ==4, a ==6, a ==9, a ==11):
    print("30 days and not an leap year")