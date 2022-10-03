from random import randint
l=[]
n=int(input("Enter the size of the list:"))
for i in range(n):
    r=randint(1,40)
    l.append(r)
print(l)