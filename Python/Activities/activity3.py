# Get the users names
user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")

# Get the users choices
user1_response = input(user1 + ",What do you Choose among [rock, paper or scissors]?").lower()
user2_response = input(user2 + ",What do you Choose among [rock, paper or scissors]?").lower()

# Run the game logic to determine who wins
if user1_response == user2_response:
    print("It's a tie!")
elif user1_response == 'rock':
    if user2_response == 'scissors':
        print(user1+" wins!")
    elif user2_response =='paper':
        print(user2+" wins!")
    else:
        print(f"Invalid input! {user2} have not entered rock, paper or scissors, try again.")
elif user1_response == 'scissors':
    if user2_response == 'paper':
        print(user1+" wins!")
    elif user_response=='rock':
        print(user2+" wins!")
    else:
        print(f"Invalid input! {user2} have not entered rock, paper or scissors, try again.")
elif user1_response == 'paper':
    if user2_response == 'rock':
        print(user1+" wins!")
    elif user2_response=='scissors':
        print(user2+" wins!")
    else:
        print(f"Invalid input! {user2} have not entered rock, paper or scissors, try again.")
        
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
