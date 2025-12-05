# Ask user for input for list1
user_input1 = input("Enter numbers separated by spaces for First List: ")
list1 = [int(num) for num in user_input1.split()]
user_input2 = input("Enter numbers separated by spaces for Second List: ")
list2 = [int(num) for num in user_input2.split()]

#Result List
list3=[]
#Odd numbers for List1
for num in list1:
     if (num%2!=0):
          list3.append(num)


#even numbers from List2
for num in list2:
     if (num%2==0):
          list3.append(num)


print("Combined Odd numbers from First List and Even numbers from Second List:")
print(list3)
