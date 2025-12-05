
def isFirstAndLastSame(list):
# checking first and last numbers are same
  return list[0]==list[-1]
   

# Ask user for input
user_input = input("Enter numbers separated by spaces: ")

# Convert input string to a list of integers
numbers = [int(num) for num in user_input.split()]

print("List of Numbers entered by the user:",numbers)

print(f"Is First and Last numbers in the list same?: {isFirstAndLastSame(numbers)}")


