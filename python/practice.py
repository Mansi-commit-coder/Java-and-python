"""here wehave to find the root of an quardatic equation 
for this we have tyo focus on Descriminanat there were three condition for descriminanat 
if D > 0 then the equation have to real roots 
if D<0 THERE THE equation have two complex roots
id D= 0 then the equation have only one root that is real.
here D= b*b -4ac
"""
import math
a = float(input("Enter the value of a for the equation D= b^2 -4ac :"))
b = float(input("Enter the value of b for thr equation D= b^2 -4ac :"))
c = float(input("Enter the value of c for thr equation D= b^2 -4ac :"))

if a == 0:
    print("Invalid input please put value of a other than 0. ")
    
else:
    descriminant = b*b - 4*a*c
    root = math.sqrt(abs(descriminant))
    
    if(descriminant>0):
        
      # if descriminant is >0 then there where two real roots thats formula is also used
       root1 = (-b + root)/2*a
       root2 = (b - root)/2*a
       print("the given equation have two roots" + root1 + "and "+root2)

    else:
      #if descriminant is<0 then there were two roots one is real and another is imaginary the formula for the roots is given 
       real_part = -b/2*a
       imaginary_part = root/2*a
       print("it hase two complex roots", real_part, "-" , imaginary_part ,"i and " , real_part , "+" ,imaginary_part , "i")

    