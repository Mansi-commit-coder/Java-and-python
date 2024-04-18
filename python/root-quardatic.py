"""here the question is to find the root of quardatic equation 
so we have one term that is descriminant which determin whether the roots are real or complex 
so
if D > 0 then there are two real roots
if D< 0 then there are two complex roots
if D = 0 then there is only one real root

now formula to find descriminant is used in the solution as well
"""


import math
a = float(input("Enter value of a for the quardatic equation D = b*b -4ac :"))
b = float(input("Enter value of b for the quardatic equation D = b*b -4ac :"))
c = float(input("Enter value of c for the quardatic equation D = b*b -4ac :"))

if(a == 0):
    print("Invalid input please enter value other than 0.")
else:
    descrimanant = b*b - 4*a*c
    root = math.sqrt(abs(descrimanant))
    if(descrimanant > 0):
        #there are two real roots whose formula is root1 = -b + sq root(b^2 -4ac)/2a, change sign for root2
        root1 = -b + root/2*a
        root2 = b - root/2*a
        print("the given quardatic equation have two real values", root1, root2)
        
    elif(descrimanant < 0):
        
        #there are two complex root we will split real and complex part and compine it in the output 
        
        real_part = -b/2*a
        # here root we have decleared the root of descirimanant
        imaginary_part = root/2*a
        print("it hase two complex roots", real_part, "-" , imaginary_part ,"i and " , real_part , "+" ,imaginary_part , "i")
        
    elif( descrimanant == 0):
        
        #it has on only one root
        real_root = -b/2*a
        print("it has one real root", real_root)
        
        
