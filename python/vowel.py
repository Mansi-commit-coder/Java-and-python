# taking input first from the user 
"""" checking whether the entered character is vowel or any
consonant or an special character"""


chr = input("Enter any character : ")
if(chr == 'a' or chr =='e' or chr =='i' or chr =='o' or chr =='u' or chr =='A' or chr =='E' 
   or chr =='I' or chr =='O' or chr =='U'):
    print("Entered value is vowel",chr)
elif((chr >='A' and chr <='Z') or (chr >='a' and chr <='z')):
    print("Entered value is consonant", chr)
else:
    print("Entered value is special character", chr)
    
