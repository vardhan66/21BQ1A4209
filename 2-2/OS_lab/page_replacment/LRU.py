def LRU(pages: list[int],capacity:[int]):
    memory=[]
    lru=[]
    pagefault=0
    for page in pages:
        if page not in memory:
            if len(memory)<capacity:
                pagefault+=1
                memory.append(page)
                lru.append(page)
            else:
                pagefault +=1
                index=memory.index(lru[-1])
                memory[index]=page
                lru.pop(0)
                lru.append(page)
        else:
            index=lru.index()
            lru.pop(index)
            lru.append(page)
    return pagefault

pages=list(map(int,input("Enter the sequence").strip().split()))
capacity=int(input("Enter the maximum capacity:"))
print("The no of page faults are",LRU(pages,capacity))