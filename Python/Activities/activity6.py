#Nested Loop

# Pattern: numbers from 1 to 9, repeated i times on each line
for i in range(1, 10):
    for j in range(i):
        print(i, end="")
    # move to next line
    print() 
