#Variable
totalmem=int(input("enter total ammount of memory"))
temp=totalmem
choice="Y"
while(choice=='Y'):
    processmem=int(input("enter memory required for user process"))
    if(processmem<temp):
        print("memory allocated for user process")
        temp=temp-processmem
    else:
        print("memory is full.so memory not allocated for user process")
        break 
    choice=input("do you want to continue(Y/N)")
    
print("total available memory is",totalmem)
print("total external fragmentation is",temp)