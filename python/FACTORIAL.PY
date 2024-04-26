# WE have to find the factorial of any given number.

factorial_of = int(input("Enter any number :"))
fact = 1
if factorial_of < 0:
    print("Enter any number which is not negative.")
    
elif factorial_of == 0:
    print("factorial of is always 1.")
else:
    for i in range(1, factorial_of + 1):
        fact = fact * i
    print("factorial of number ", factorial_of , " is ", fact)
    