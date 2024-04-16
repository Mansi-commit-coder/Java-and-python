""" first take the user input and after that check whether the given input is alphabet or not"""


ch = input("Enter any value :")
if((ch>= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z')):
    print("Entered value is alphabet", ch)
else:
    print("Entered value is not an alphabet", ch)