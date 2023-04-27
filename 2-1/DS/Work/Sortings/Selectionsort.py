def Selectionsort(l):#passing the list as argument
    k=len(l)-1#k is the size of the array
    for i in range(k):
        m=i#m is the current index
        for j in range(i+1,len(l)):#Iterating the loop by checking from next index
            if l[j]<l[m]:#if element is lessthan current index 
                m=j#it is assigned to m and checking continues
        l[m],l[i]=l[i],l[m]#swapping the elements

    return l#returning the sorted list
l=[]#Emptylist
n=int(input("Enter the size of the array:"))
for i in range (n):#iterating loop in the given size
    e=int(input(":"))
    l.append(e)#adding element into the list
print(Selectionsort(l))
