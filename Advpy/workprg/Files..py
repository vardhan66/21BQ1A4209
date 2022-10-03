f=open("D:/Labs/Python/Py/Sample.txt",'w+')
l=[]
for i in range(3):
    n=input("Enter Data")
    f.write(n+'\n')
    l.append(n+'\n')
f.writelines(l)
f.close()