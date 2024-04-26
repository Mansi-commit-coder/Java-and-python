""" here we have to first find out the value of descriminant if it > 0 the there are two roots and 
it its <0 then there are two roots but complex and if  it is equal to 0 then only one real root

d = b*b - 4*ac
real_root1 = -b +sq root of d/2a
real root2 = b + sq root of d/2a

complex_root 1 = -b +sq root of d/2a i
complex_root 2 = b - sq root of d/2a i
"""

import math

a = float(input("Enter any number of a for the equation d = b*b - 4qc : "))
if a == 0:
    print("Enter any number other than 0.")
else:
    b = float(input("Enter the value of b in the equation d = b*b -4ac : "))
    c = float(input("Enter the value of c in the equation d = b*b -4ac : "))
    
    D = b*b - 4*a*c
    root = math.sqrt(abs(D))
    if D > 0:
        # then there are two roots 
        real_root1 = -b + root/2*a
        real_root2 = b - root/2*a
        print("There are two real root", real_root1, " and ", real_root2)
    elif D<0:
        complex_root1 = -b/2*a + root/2*a
        
        complex_root2 =  -b/2*a - root/2*a
        print("There are two Complex root", complex_root1, "i and ", complex_root2, "i")
    elif D ==0:
        real_root = -b/2*a
        print("Only one real root ", real_root)
        

    