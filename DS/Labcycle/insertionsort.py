def insort(l):
    for i in range(len(l)):
        a=l[i]
        j=i
        while l[j-1]>a and j>=1:
            l[j]=l[j-1]
            j-=1
        l[j]=a
    return l
    
n=int(input("Enter size of array:"))
l=[]
for i in range (n):
    e=int(input("Enter element:"))
    l.append(e)
print(insort(l))

