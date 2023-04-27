def vowel(l):
    v='aeiou'
    s=list(set(l[0].lower()))
    k=0
    print(s)
    for i in range(len(v)):
        if v[i] in s:
            k+=1
        else:
            print("Doesn't conatins all vowels")
    if k==len(v):
        print("It contains all vowels")
    else:
        print("Dosn't contains all vowels")
    return
l=[]
e=(input(":"))
l.append(e)
vowel(l)
        