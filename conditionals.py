a = int(input("welcome to the credit card eligibility checker! Please enter your age: "))

if 18 <=a < 80:
    print("Eligible for credit card")
elif a > 80:
    print("too old for credit card")
else:
    print("Not eligible for credit card")