def FIFO(pages,capacity):
    memory=[]
    pagefaults=0
    for page in pages:
        if page not in memory:
            pagefaults+=1
            
            if len(memory)<capacity:
                memory.append(pages)
            else:
                memory.pop(0)
                memory.append(page)
    return pagefaults

pages=list(map(int,input("Enter input sequence").strip().split()))
capacity=int(input("Enter capacity:"))
print("The no of page faults are",FIFO(pages,capacity))