'''def Check(l):
    c='akeotpn'
    l1=list(set(c))
    for i in range(len(l)):
        k=0
        v=list(set(l[i].lower()))
        for j in range(0,len(v)):
            if v[j] in l1:
                k+=1      
        if k==len(v):
            print(l[i])
l=['Eat','Peot','Knife','Peacock','Varun','Arun','Net','Pot','Toe','Poke','kent','Zebra','Nato','Peak','Venus','Ant']
Check(l)'''
