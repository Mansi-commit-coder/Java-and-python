num = int(input("Enter the number : "))
a , b= 0, 1
count = 0
if num <= 0:
    print("enter any positive number ")
elif num == 1:
    print("fabonacci series is 1 ", num)
    print(a)
else:
    print("fabonacci series of ", num, " is : ")
    while count < num:
        print(a)
        c = a + b
        a = b
        b = c
        count += 1
    