# User enters their own tuple

user_input1 = input("Enter numbers separated by spaces for tuple: ").split()
num_tuple = tuple((int(num) for num in user_input1))

print("User Entered Tuple is :", num_tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)