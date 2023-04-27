
def recurse():
    count=0
    count+=1
    recurse()
    return count
print(recurse())