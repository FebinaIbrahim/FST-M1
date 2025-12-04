#multiplication table
number = int(input("Enter a number of your choice:"))

for multiplier in range(1,11,1):
    print(f" {number} * {multiplier} =",number*multiplier)