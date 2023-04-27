def Linearsearch(l,c_i,k):
    if c_i<0:
        return -1
    elif l[c_i-1]==k:
        return c_i
    else:
        return Linearsearch(l,c_i-1,k)

n=int(input("Enter the size of array:"))
l=[]
for i in range(n):
      e=int(input("Enter element:"))
      l.append(e)
k=int(input("Enter your desired element:"))
r=Linearsearch(l,n,k)
if r==-1:
    print("element not found")
else:
    print("element is found at",r,"position")
