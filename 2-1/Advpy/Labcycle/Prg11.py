f=open(r"C:\Users\eswar\Desktop\File.txt",'r')
lcount=wcount=ccount=0
for line in f:
    lcount+=1
    wcount+=len(line.split())
    for l in line:
        if(l!=' ' and l!='\n'):
            ccount+=1
print('No. of Lines=',lcount)
print('No. of Words=',wcount)
print('No. of Characters=',ccount)
f.close()
