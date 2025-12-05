
# Ask user for input
user_input = input("Enter numbers separated by spaces: ")

# Convert input string to a list of integers
numbers = [int(num) for num in user_input.split()]

# Calculate sum
total=0
for number in numbers:
    total+=number

print(f"The sum of the list is: {total}")
