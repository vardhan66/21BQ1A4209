def insort(l):
    
    key = l[i]
 
 # Move elements of arr[0..i-1], that are
        # greater than key, to one position ahead
        # of their current position
    j = i-1
    while j >= 0 and key < l[j] :
            l[j + 1] = l[j]
            j -= 1
    l[j + 1] = key
    return l
n=int(input("Enter size of array:"))
l=[]
for i in range (n):
    e=int(input("Enter element:"))
    l.append(e)
print(insort(l))

